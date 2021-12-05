abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
class Mybook extends Book{

	@Override
	void setTitle(String s) {
		this.title =s;
		
	}
	
}
public class Book{

	public static void main(String[] args) {
		Mybook b = new Mybook();
		b.setTitle("A tale of two cities");
		System.out.println("The title is: "+b.getTitle());
	}

}