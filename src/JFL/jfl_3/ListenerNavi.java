package JFL.jfl_3;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ListenerNavi extends MouseAdapter {

    String str = " ";

    @Override
    public void mouseClicked(MouseEvent ev) {
        //TextWindow.textArea.setText(Navi.listMenu.getSelectedValue());

        switch (Navi.listMenu.getSelectedValue()) {

            //----------------------------------------------------//
            case "Бит":
                str = "binary digit — двоичное число " + "\n" +
                        "принимает значения 0 или 1";
                TextWindow.textArea.setText(str);
                break;
            //----------------------------------------------------//
            case "Байт":
                str = "byte - занимает 8 bit";
                TextWindow.textArea.setText(str);
                break;
            //----------------------------------------------------//
            case "JVM":
                str = "JVM (Java Virtual Machine) - виртуальная машина Java";
                TextWindow.textArea.setText(str);
                break;
            //----------------------------------------------------//
            case "JDK":
                str = "JDK (Java Development Kit) - комплект разработчика на языке Java ";
                TextWindow.textArea.setText(str);
                break;
            //----------------------------------------------------//
            case "JRE":
                str = "JRE (Java Runtime Environment) Минимальная реализация виртуальной машины, " + "\n" +
                        "необходимая для исполнения Java-приложений. " + "\n" +
                        "Состоит из виртуальной машины Java Virtual Machine и библиотеки Java-классов.\n ";
                TextWindow.textArea.setText(str);
                break;
            //----------------------------------------------------//
            case "Hello World!":
                str = "Hello World! - привет мир!";
                TextWindow.textArea.setText(str);
                break;
            //----------------------------------------------------//
            case "Переменная":
                str = "Переменная - она такая - то изменчивая, то постоянная";
                TextWindow.textArea.setText(str);
                break;
            //----------------------------------------------------//
            case "Функция":
                str = "Функция - штука сложная.";
                TextWindow.textArea.setText(str);
                break;

            //----------------------------------------------------//
            case "Класс":
                str = "Класс - шаблон для создания объекта";
                TextWindow.textArea.setText(str);
                break;

            //----------------------------------------------------//
            case "Объект":
                str = "Объект - экземпляр класса";
                TextWindow.textArea.setText(str);
                break;


            default:
                TextWindow.textArea.setText(Navi.listMenu.getSelectedValue());
                break;
        }
    }
}


/* TextWindow.textArea.setText(TextBase.str);
TextBase.text(TextBase.getStr());
 TextWindow.textArea.setText(TextBase.getStr())*/

