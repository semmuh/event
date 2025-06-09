package at.muharremoglu.concert.views.create;


import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.awt.*;

@PageTitle("Erstellen")
@Menu(title = "Erstellen", order = 4, new LineAwesomeIconUrl())
@Route(value = "createSelections")

public class CreateSelectionView extends VerticalLayout {

    public CreateSelectionView(){
        setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setAlignItems(Alignment.CENTER);

        Dialog dialog = createActionDialog();
        dialog.open();
    }

private Dialog createActionDialog(){
        Dialog dialog = new Dialog();
        dialog.setCloseOnEsc(true);
        dialog.setCloseOnOutsideClick(false);

        H2 title = new H2("Was möchten Sie tun?");
        title.getStyle().set("margin-top", "0");

}


}