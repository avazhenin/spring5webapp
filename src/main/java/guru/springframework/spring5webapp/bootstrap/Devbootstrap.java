package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.model.Author;
import guru.springframework.spring5webapp.model.Book;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class Devbootstrap implements ApplicationListener<ContextRefreshedEvent>{

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){
        //Eric
        Author eric = new Author("Eric","Evans");
        Book ddd = new Book("Domain driver desing","1234","Harper Collins");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        //Rod
        Author rod = new Author("Rod","Jonson");
        Book noEJB = new Book("Java2EE Development without EJB","56789","Worx");
        eric.getBooks().add(noEJB);
        ddd.getAuthors().add(rod);
    }
}
