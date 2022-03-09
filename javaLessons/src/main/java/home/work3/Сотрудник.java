package home.work3;

import java.awt.event.WindowFocusListener;

public class Сотрудник {
    public String ФИО,должность,email,телефон,зарплата;
    public int возраст;
    public Сотрудник(String ФИО,String должность,String email,String телефон,String зарплата,int возраст){
        this.ФИО=ФИО;
        this.должность=должность;
        this.email=email;
        this.телефон=телефон;
        this.зарплата=зарплата;
        this.возраст=возраст;
    }
public void   info(){
    System.out.println(ФИО+"\n"+должность+"\n"+email+"\n"+телефон+"\n"+зарплата+"\n"+возраст+"\n");

}
}
