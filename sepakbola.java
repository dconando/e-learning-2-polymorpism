public class sepakbola extends olahraga{
public void pukul(){
System.out.println("eh kalo sepak bola ditendang deh bukan dipukul");
}

public static void main(String[] args){
olahraga og = new olahraga();
badminton bd = new badminton();
tinju tj = new tinju();
sepakbola sb = new sepakbola();

og.pukul();

og = bd;
og.pukul();

og = tj;
og.pukul();

og = sb;
og.pukul();
}
}