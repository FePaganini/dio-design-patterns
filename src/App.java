import facade.Facade;
import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;
import strategy.ComportamentoDefensivo;
import strategy.ComportamentoNormal;
import strategy.IComportamento;
import strategy.Robo;

public class App {
    public static void main(String[] args) throws Exception {
        // Singleton
		
		SingletonLazy lazy = SingletonLazy.getSingleton();
		System.out.println(lazy);
		lazy = SingletonLazy.getSingleton();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getSingleton();
		System.out.println(eager);
		eager = SingletonEager.getSingleton();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getSingleton();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getSingleton();
		System.out.println(lazyHolder);
		
		// Strategy
		
		IComportamento defensivo = new ComportamentoDefensivo();
		IComportamento normal = new ComportamentoNormal();
		
		Robo robo = new Robo();
		robo.setStrategy(normal);
		robo.mover();
		robo.mover();
		robo.setStrategy(defensivo);
		robo.mover();
		robo.mover();
        robo.setStrategy(normal);
		robo.mover();
		robo.mover();
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Felipe", "09580900");
    }
}
