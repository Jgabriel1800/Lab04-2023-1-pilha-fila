package list;

public class FilaNovo implements Fila{
    
    private int tamanho;
    private No inicio;
    private No fim;
    private class No{
        int valor;
        No seguinte;
        No(int valor){
            this.valor=valor;
            this.seguinte=null;
        }
    }
    public FilaNovo(){
        this.inicio=null;
        this.fim=null;
        this.tamanho=0;
    }
    
    @Override
    
    public void enqueue(int item){
        No novoNo = new No (item);
        if(isEmpty()){
            inicio=novoNo;
            fim=novoNo;
        }else{
            fim.seguinte=novoNo;
            fim= novoNo;
        }
        tamanho++;
    }
    
    @Override
    
    public int dequeue(){
        if(isEmpty()){
            throw new IllegalStateException("Fila vazia");
        }
        int valorfora=inicio.valor;
        inicio= inicio.seguinte;
        tamanho--;
        if(isEmpty()){
            fim = null;
        }
        return valorfora;
    }
    @Override
    
    public boolean isEmpty(){
        return inicio==null;
    }
    @Override
    
    public int size(){
        return tamanho;
    }
}
