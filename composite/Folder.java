package composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileComposite {
    String name = "";
    List<FileComposite> fileComponents = new ArrayList<>();

    public Folder(String name, List<FileComposite> fileComponents) {
        this.name = name;
        this.fileComponents = fileComponents;
    }

    public void expand() {
        for (FileComposite component : fileComponents) {
            System.out.println(component.getName());
        }
    }

    public int getSize() {
        int sum = 0;
        for (FileComposite component : fileComponents) {
            sum += component.getSize();
        }
        return sum;
    }

    public String getName() {
        return name;
    }
}
