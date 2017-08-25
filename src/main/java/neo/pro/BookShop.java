package neo.pro;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 * Created by vanosov on 25.08.2017.
 */
@ManagedBean(name = "bookShop")
@SessionScoped
public class BookShop {

    private String bookName;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void showMessage() {
        FacesMessage message = new FacesMessage(bookName, "Book in your basket");
        message.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
