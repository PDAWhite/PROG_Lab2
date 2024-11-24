package moves;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Effect;

public class Swagger extends StatusMove{
	public Swagger(){
		super(Type.NORMAL, 0, 85);	
	}
	@Override
	protected void applyOppEffects(Pokemon p){
		super.applyOppEffects(p);
		p.setMod(Stat.ATTACK, 2);
		Effect.confuse(p);
	}
	@Override
	protected String describe(){
		return "использует Swagger.";
	}
}