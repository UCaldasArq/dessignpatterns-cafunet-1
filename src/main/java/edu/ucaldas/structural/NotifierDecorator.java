package edu.ucaldas.structural;

// 1. Clase abstracta NotifierDecorator que implementa Notifier.
public abstract class NotifierDecorator implements Notifier {
    protected Notifier wrappee;

    public NotifierDecorator(Notifier wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public String send(String message) {
        // La lógica central del decorador se mantiene intacta: 
        // delega la ejecución al objeto que está envolviendo.
        return wrappee.send(message);
    }
}

// 2. Clase SMSNotifier que extiende NotifierDecorator
class SMSNotifier extends NotifierDecorator {
    
    public SMSNotifier(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public String send(String message) {
        // Capturamos el resultado del notificador que está "por debajo" (ej. el Email)
        String resultadoBase = super.send(message);
        
        // Cambiamos el mensaje y usamos String.format para una estructura más limpia
        return String.format("[Alerta SMS] Texto: '%s' ~~~ (Aviso previo: %s)", message, resultadoBase);
    }
}