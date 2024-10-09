package com.sandbox.stacks;

public interface Stack <E>{

   public abstract boolean empty();
   public abstract E peek();
   public abstract E pop();
   public abstract void push(E item);
   public abstract int search(E item);

}
