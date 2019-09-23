import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@PluginDescriptor(
        name = "Example External Plugin",
        description = "Example External Plugin for demoing external plugins with OPRS.",
        enabledByDefault = false,
        type = PluginType.EXTERNAL
)
public class ExamplePlugin extends Plugin {
    private static final Logger logger = LoggerFactory.getLogger(ExamplePlugin.class);

    @Override
    protected void startUp() {
        logger.info("Example Plugin started!");
    }

    @Override
    protected void shutDown() {
        logger.info("Example Plugin Stopped shutDown!");
    }
}
