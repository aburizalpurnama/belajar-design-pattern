package adapter.pattern;

import javax.script.ScriptEngine;
import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.List;

public class AdapterApp {

    public static void main(String[] args) {

        getCatalogWithAdapter();

//        getCatalogManual();
    }
    static void getCatalogWithAdapter(){
        List<Adapter> list = new ArrayList<>();

        list.add(new BookAdapter(new Book("Beranak dalam kubur", "Subani")));
        list.add(new BookAdapter(new Book("Beranak dalam kulkas", "Subandi")));
        list.add(new BookAdapter(new Book("Beranak dalam kuali", "Subari")));

        list.add(new ScreenCastAdapter(new ScreenCast("Tutorial meninggoy", "abdul", 40l)));
        list.add(new ScreenCastAdapter(new ScreenCast("Tutorial meningsoy", "abdur", 40l)));
        list.add(new ScreenCastAdapter(new ScreenCast("Tutorial ga jelas", "abdulah", 40l)));

        list.forEach(item ->{
            System.out.println(item.getCatalogTittle());
        });
    }

    static void getCatalogManual(){
        List<Object> list = new ArrayList<>();

        list.add(new Book("Beranak dalam kubur", "Subani"));
        list.add(new Book("Beranak dalam kulkas", "Subandi"));
        list.add(new Book("Beranak dalam kuali", "Subari"));

        list.add(new ScreenCast("Tutorial meninggoy", "abdul", 40l));
        list.add(new ScreenCast("Tutorial meningsoy", "abdur", 40l));
        list.add(new ScreenCast("Tutorial ga jelas", "abdulah", 40l));

        list.forEach(item ->{
            if (item instanceof Book){
                Book book = (Book) item;
                System.out.println(book.getTittle() + " by. " + book.getAuthor());
            }else if (item instanceof ScreenCast){
                ScreenCast screenCast = (ScreenCast) item;
                System.out.println(screenCast.getTittle() + " by. " + screenCast.getAuthor());
            }
        });
    }
}
