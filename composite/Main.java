package composite;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String... args) {
        FileComposite file1 = new File("file1", 5);
        FileComposite file2 = new File("file2", 10);
        List<FileComposite> listFileComponent1 = new ArrayList<>();
        listFileComponent1.add(file1);
        listFileComponent1.add(file2);
        Folder folder1 = new Folder("folder1", listFileComponent1);
        List<FileComposite> listFileComponent2 = new ArrayList<>();
        listFileComponent2.add(folder1);
        listFileComponent2.add(new File("file3", 15));
        listFileComponent2.add(new File("file4", 3));
        Folder folder2 = new Folder("folder2", listFileComponent2);
        folder2.expand();
        System.out.println(folder2.getSize());
    }
}
