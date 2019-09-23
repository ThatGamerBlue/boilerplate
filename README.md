# How to create an external plugin for OPRS

## Presetup
0. You will want to already have the main OPRS client compiling, as this is a good test to make sure your environment can handle building and running plugins.

## Boilerplate Repository

1. Clone the boilerplate repository from https://github.com/oprs-plugins/boilerplate

This is an example repository which you can use to build your own external plugin. Most of the time fi you have already built a plugin using the client you can just copy it into the `src/main/java` folder.

If you look in the `settings.gradle` file you will need to change the project name to your plugin name.