package  list;
public class PilhaNova implements Pilha{
    
    private No topopilha;
    private class No{
        
        int valor;
        No proximo;
        No(int valor){
            this.valor=valor;
            this.proximo=null;
        }
    }
    @Override
    
    public boolean isEmpty(){
        return topopilha== null;
    }
    @Override
    
    public void push(int item){
        
        No novoNo= new No (item);
        novoNo.proximo=topopilha;
        topopilha=novoNo;
    }
    @Override
    
    public int pop(){
        
        if(isEmpty()){
            throw new IllegalStateException("Pilha vazia");
        }
        int valor=topopilha.valor;
        topopilha=topopilha.proximo;
        return valor;
    }

}

