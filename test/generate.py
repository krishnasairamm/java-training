import os
import random
from PIL import Image

# Paths
ASSETS_DIR = "assets"
OUTPUT_DIR = "output"
TOTAL_IMAGES = 50  # You can set 100 or more

# Order of traits (layering order)
LAYERS = ["background", "body", "eyes", "hat"]

# Ensure output folder exists
os.makedirs(OUTPUT_DIR, exist_ok=True)

# Load all trait files
traits = {}
for layer in LAYERS:
    layer_path = os.path.join(ASSETS_DIR, layer)
    traits[layer] = [os.path.join(layer_path, f) for f in os.listdir(layer_path) if f.endswith(".png")]

# Generate NFTs
for i in range(TOTAL_IMAGES):
    composite = None
    combo = {}

    for layer in LAYERS:
        choice = random.choice(traits[layer])
        combo[layer] = os.path.basename(choice)
        layer_img = Image.open(choice).convert("RGBA")

        if composite is None:
            composite = layer_img
        else:
            composite = Image.alpha_composite(composite, layer_img)

    composite.save(f"{OUTPUT_DIR}/nft_{i}.png")
    print(f"Generated nft_{i}.png with traits: {combo}")
