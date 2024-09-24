public class Category extends Product//Category - derived class extends from base product class
{
    int CatId;
    String CatName;

   // public void Show()
   //Method Overriding
    @Override
    public void Display()
    {

        System.out.println("Category ID: " + CatId+"\nCategoryName:"+CatName);
        super.Display();//control goes to base class display method
    }
}
