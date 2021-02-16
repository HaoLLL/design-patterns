package com.company.command;

// command is an object
public interface Command {
    public void execute();
}
class Light{
    public void on(){
        System.out.println("light on ");
    }
}
class LightOnCommand implements Command{
    Light light;
    public LightOnCommand(Light light){
        this.light = light;
    }
    public void execute(){
        light.on();
    }
}
class SimpleRemoteControl{
//    command slot in the controller
    Command slot;
    public SimpleRemoteControl(){

    }
    public void setCommand(Command command){
        slot = command;
    }
    public void buttonWasPressed(){
        slot.execute();
    }
}


