package neo.pro;

import neo.pro.generator.NumberGenerator;

import javax.enterprise.inject.Default;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

/**
 * Created by vanosov on 25.08.2017.
 */
@ManagedBean(name = "bookShop")
@SessionScoped
public class BookShop {

    private String bookName;

    @Inject @Default
    NumberGenerator numberGenerator;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void showMessage() {
        FacesMessage message = new FacesMessage(bookName, "Book in your basket with ISBN = " + numberGenerator.generateNumber());
        message.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
