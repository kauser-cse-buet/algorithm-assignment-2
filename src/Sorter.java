import java.util.List;

//A sorter for a List<Element>
public interface Sorter<Element> {
//e1 precedes e2 in the sort ordering.
public boolean inOrder (Element e1, Element e2);
//Sort specified List<Element> according to this.inOrder.
public void sort (List<Element> list);
}