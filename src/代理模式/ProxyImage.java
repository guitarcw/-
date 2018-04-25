package 代理模式;

public class ProxyImage implements Image {
    static String m;
     RealImage realImage;
    private String fileName;
    ProxyImage(String fileName){
        this.fileName=fileName;
    }
    @Override
    public void display() {
        if(realImage==null){
            realImage=new RealImage(fileName);
        }
        realImage.display();
    }
}
