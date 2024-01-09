# Nombre del archivo fuente (sin extensión)
SOURCE_FILE = $(file)

# Nombre del ejecutable
TARGET = bin\$(SOURCE_FILE).exe

# Compilador
CXX = g++

# Opciones de compilación
CXXFLAGS = -std=c++11 -Wall -g -ggdb

.PHONY: all run debug clean

# Regla por defecto: compilar el programa
all: $(TARGET)

# Regla para compilar el programa
$(TARGET): src/$(SOURCE_FILE).cpp
	@$(CXX) $(CXXFLAGS) $< -o $@

# Regla para ejecutar el programa
run: $(TARGET)
	@.\$(TARGET)
# Regla para debugear el programa
debug: $(TARGET)
	@gdb .\$(TARGET)
# Regla para eliminar el ejecutable
clean:
	@del .\$(TARGET)