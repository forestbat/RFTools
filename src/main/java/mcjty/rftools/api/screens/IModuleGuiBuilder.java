package mcjty.rftools.api.screens;

/**
 * A builder to help create gui's for your screen modules
 */
public interface IModuleGuiBuilder {

    IModuleGuiBuilder label(String text);

    IModuleGuiBuilder leftLabel(String text);

    IModuleGuiBuilder text(String tagname, String... tooltip);

    IModuleGuiBuilder integer(String tagname, String... tooltip);

    IModuleGuiBuilder toggle(String tagname, String label, String... tooltip);

    IModuleGuiBuilder toggleNegative(String tagname, String label, String... tooltip);

    IModuleGuiBuilder color(String tagname, String... tooltip);

    IModuleGuiBuilder format();

    IModuleGuiBuilder mode(String componentName);

    IModuleGuiBuilder monitor();

    IModuleGuiBuilder nl();
}
