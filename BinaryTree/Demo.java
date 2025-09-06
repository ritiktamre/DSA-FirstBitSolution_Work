package BinaryTree;

public class Demo {
   int id;
  Demo left;
   Demo right;


   
   public Demo() {
	// TODO Auto-generated constructor stub
}

public Demo(int id) {
	super();
	this.id = id;
}

int getId() {
	return id;
}

void setId(int id) {
	this.id = id;
}

Demo getLeft() {
	return left;
}

void setLeft(Demo left) {
	this.left = left;
}

Demo getRight() {
	return right;
}

void setRight(Demo right) {
	this.right = right;
}

}
