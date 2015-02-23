// Andrew Ribicki 
// 2/23/15 
// CMP 112A Test 1 

 class Phone {
	public int idNum;
	public String name;
	public String make;

	 public int nextID = 0;
/*------------------------------------------------------------------*/
//C1
Phone() {
  idNum = nextID++;
  }

//C2
Phone(String make, String name) {
this();
name = name;
make = make;
}

//C3
Phone(String name) {
this();
name = name;
make = null;
}


public String toString() {
  String desc = idNum + " ("+ name + ")";
  if (name !=null)
    desc += " make " + make.toString();
  return desc;
}
}



	
