package list;

import list.PilhaNova;

public class FilaComPilha2 implements FilaComPilha {
    private PilhaNova pilha1;
    private PilhaNova pilha2;
    public FilaComPilha2(){
        this.pilha1= new PilhaNova();
        this.pilha2=new PilhaNova();
    }
    @Override
    public void enqueue(int item){
        pilha1.push(item);
    }
    @Override
    public int dequeue(){
        if(isEmpty()){
            throw new IllegalStateException("Fila vazia");
        }
        if(pilha2.isEmpty()){
            Pilha1Pilha2();
        }
        return pilha2.pop();
    }
    @Override
    public boolean isEmpty(){
        return pilha1.isEmpty() && pilha2.isEmpty();
    }
    @Override
    public int size(){
        return pilha1.size() + pilha2.size();
    }

    private void Pilha1Pilha2(){
        while (!pilha1.isEmpty()){
            pilha2.push(pilha1.pop());
        }
    }
    
}
