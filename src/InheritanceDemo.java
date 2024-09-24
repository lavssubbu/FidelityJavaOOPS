public class InheritanceDemo {
    public static void main(String[] args) {
//        Category cat = new Category();
//        cat.Proid=111;
//        cat.ProName="Laptop";
//        cat.ProPrice=90000;
//        cat.CatId =1;
//        cat.CatName="Electronics";
//
//        cat.Display();
       // cat.Show();

        Brand br=new Brand();
        br.Proid=111;
        br.ProName="Laptop";
        br.ProPrice=90000;
        br.CatId =1;
        br.CatName="Electronics";
        br.BrandName= "Mac";

        br.Display(); //control goes to Brand class
    }
}
