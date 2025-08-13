const canvas = document.getElementById("nftCanvas");
const ctx = canvas.getContext("2d");

const traits = {
  background: ["assets/background/red.png", "assets/background/blue.png"],
  body: ["assets/body/ape1.png"],
  eyes: ["assets/eyes/eyes1.png"],
  hat: ["assets/hat/cap.png"]
};

const layers = ["background", "body", "eyes", "hat"];

function getRandomTrait(traitArray) {
  const i = Math.floor(Math.random() * traitArray.length);
  return traitArray[i];
}

async function loadImage(src) {
  return new Promise((resolve, reject) => {
    const img = new Image();
    img.crossOrigin = "anonymous"; // important if you host assets online
    img.onload = () => resolve(img);
    img.onerror = reject;
    img.src = src;
  });
}

async function generateNFT() {
  ctx.clearRect(0, 0, canvas.width, canvas.height);

  for (const layer of layers) {
    const traitSrc = getRandomTrait(traits[layer]);
    const img = await loadImage(traitSrc);
    ctx.drawImage(img, 0, 0, canvas.width, canvas.height);
  }
}

function saveNFT() {
  const link = document.createElement('a');
  link.download = 'nft.png';
  link.href = canvas.toDataURL();
  link.click();
}
