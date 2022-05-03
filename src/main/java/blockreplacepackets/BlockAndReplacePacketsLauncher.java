package blockreplacepackets;

import gearth.extensions.ThemedExtensionFormCreator;

import java.net.URL;

public class BlockAndReplacePacketsLauncher extends ThemedExtensionFormCreator {

    @Override
    protected String getTitle() {
        return "Packet blocker &/ replacer";
    }

    @Override
    protected URL getFormResource() {
        return BlockAndReplacePackets.class.getResource("blockreplace.fxml");
    }

    public static void main(String[] args) {
        runExtensionForm(args, BlockAndReplacePacketsLauncher.class);
    }

}
