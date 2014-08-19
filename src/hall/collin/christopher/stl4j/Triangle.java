/*
The MIT License (MIT)

Copyright (c) 2014 CCHall (aka Cyanobacterium aka cyanobacteruim)

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/


package hall.collin.christopher.stl4j;


/**
 *
 * @author CCHall
 */
public class Triangle {
	final Vec3d[] vertices;
	final Vec3d normal;
	
	public Triangle(Vec3d v1, Vec3d v2, Vec3d v3){
		vertices = new Vec3d[3];
		vertices[0] = v1;
		vertices[1] = v2;
		vertices[2] = v3;
		Vec3d edge1 = v2.sub(v1);
		Vec3d edge2 = v3.sub(v1);
		normal = Vec3d.cross(edge1, edge2).normalize();
	}
	
	@Override public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Triangle[");
		for(Vec3d v : vertices){
			sb.append(v.toString());
		}
		sb.append("]");
		return sb.toString();
	}
}
