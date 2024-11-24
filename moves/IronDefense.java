package moves;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

public class IronDefense extends StatusMove{
	public IronDefense(){
		super(Type.STEEL, 0, 100);	
	}
	@Override
	protected void applySelfEffects(Pokemon p){
		p.setMod(Stat.DEFENSE, 2);
	}
	@Override
	protected String describe(){
		return "использует Iron Defense.";
	}
}