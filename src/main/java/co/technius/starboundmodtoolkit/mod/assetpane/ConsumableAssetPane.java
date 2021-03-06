package co.technius.starboundmodtoolkit.mod.assetpane;

import javafx.collections.FXCollections;
import javafx.scene.control.ComboBox;
import co.technius.starboundmodtoolkit.JsonConstants.Emote;
import co.technius.starboundmodtoolkit.mod.JsonAsset;
import co.technius.starboundmodtoolkit.mod.assetpane.JsonObjectBinding.Type;

public class ConsumableAssetPane extends ItemAssetPane
{
	@JsonObjectBinding(key = "emote", type = Type.STRING)
	private ComboBox<Emote> emote = new ComboBox<Emote>(FXCollections.observableArrayList(
		Emote.values()));
	
	public ConsumableAssetPane(JsonAsset asset) 
	{
		super(asset);
		form.add("Emote", emote);
	}
}
