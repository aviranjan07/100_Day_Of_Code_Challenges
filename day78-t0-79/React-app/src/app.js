import React, { useState } from "react";
import "./styles.css";

const emojiDictionary = {
  "😊": "Smiling",
  "😳": "disbelief",
  "😔": "sad",
  "❤️": "love",
  "😑": "annoyance",
  "😀" :"Grinning Face",
"😃": "Grinning Face with Big Eyes",
"😄": "Grinning Face with Smiling Eyes",
"😁" :"Beaming Face with Smiling Eyes",
"😆": "Grinning Squinting Face",
"😅": "Grinning Face with Sweat",
"🤣": "Rolling on the Floor Laughing",
"😂" :"Face with Tears of Joy",
"🙂" :"Slightly Smiling Face",
"🙃": "Upside-Down Face",
"😉" :"Winking Face",
"😇": "Smiling Face with Halo",
"🥰": "Smiling Face with Hearts",
"😍" :"Smiling Face with Heart-Eyes",
"🤩" :"Star-Struck",
"😘": "Face Blowing a Kiss",
"😗" :"Kissing Face",
"😚" :"Kissing Face with Closed Eyes",
"😙": "Kissing Face with Smiling Eyes",
"😋" :"Face Savoring Food",
"😛": "Face with Tongue",
"😜": "Winking Face with Tongue",
"🤪": "Zany Face",
"😝": "Squinting Face with Tongue",
"🤑": "Money-Mouth Face",
"🤗": "Smiling Face with Open Hands",
"🤭" :"Face with Hand Over Mouth",
"🤫": "Shushing Face",
"🤔": "Thinking Face",
"🤐": "Zipper-Mouth Face",
"🤨" :"Face with Raised Eyebrow",
"😐": "Neutral Face",
"😶": "Face Without Mouth",
"😶‍🌫️" : "Face in Clouds",
"😏": "Smirking Face",
"😒": "Unamused Face",
"🙄": "Face with Rolling Eyes",
"😬": "Grimacing Face",
"😮‍💨": "Face Exhaling",
"🤥":" Lying Face",
"😌": "Relieved Face",
"😪": "Sleepy Face",
"🤤": "Drooling Face",
"😴": "Sleeping Face",
"😷": "Face with Medical Mask",
"🤒": "Face with Thermometer",
"🤕": "Face with Head-Bandage",
"🤢": "Nauseated Face",
"🤮" :"Face Vomiting",
"🤧" :"Sneezing Face",
"🥵" :"Hot Face",
"🥶" :"Cold Face",
"🥴" :"Woozy Face",
"😵": "Face with Crossed-Out Eyes",
"😵‍💫":" Face with Spiral Eyes",
"🤯" : "Exploding Head",
"🤠" : "Cowboy Hat Face",
"🥳" : "Partying Face",
"😎" : "Smiling Face with Sunglasses",
"🤓" : "Nerd Face",
"🧐" : "Face with Monocle",
"😕" : "Confused Face",
"😟" : "Worried Face",
"🙁" : "Slightly Frowning Face",
"☹️" : "Frowning Face",
"😮" : "Face with Ope,n Mouth",
"😯" : "Hushed Face",
"😲" : "Astonished Face",
"🥺" : "Pleading Face",
"😦" : "Frowning Face with Open Mouth",
"😧": "Anguished Face",
"😨": "Fearful Face",
"😰": "Anxious Face with Sweat",
"😥": "Sad but Relieved Face",
"😢" :"Crying Face",
"😭" :"Loudly Crying Face",
"😱" :"Face Screaming in Fear",
"😖" :"Confounded Face",
"😣" :"Persevering Face",
"😞" :"Disappointed Face",
"😓" :"Downcast Face with Sweat",
"😩" :"Weary Face",
"😫": "Tired Face",
"🥱": "Yawning Face",
"😤": "Face with Steam From Nose",
"😡": "Enraged Face",
"😠": "Angry Face",
"🤬": "Face with Symbols on Mouth",
"😈": "Smiling Face with Horns",
"👿": "Angry Face with Horns"

};

const emojis = Object.keys(emojiDictionary);

export default function App() {
  const [emoji, setEmoji] = useState("");
  const [meaning, setMeaning] = useState("translation will appear here..");

  function changeHandler(event) {
    const inputEmoji = event.target.value;
    setEmoji(inputEmoji);

    if (inputEmoji in emojiDictionary) {
      setMeaning(emojiDictionary[inputEmoji]);
    } else {
      setMeaning("failure to recognise this emoji");
    }
  }

  function emojiClickHandler(inputEmoji) {
    setMeaning(emojiDictionary[inputEmoji]);
  }

  return (
    <div className="App">
      <h1>Inside Out</h1>
      <input
        onChange={changeHandler}
        value={emoji}
        placeholder={"Search Your Emoji"}
        style={{
          padding: "1em",
          minWidth: "80%"
        }}
      />
      <h2> {emoji} </h2> { }
      <h3> {meaning} </h3> { }
      {
        emojis.map((emoji) => (
          <span
            onClick={() => emojiClickHandler(emoji)}
            style={{ fontSize: "2rem", padding: "0.5rem", cursor: "pointer" }}
          >
            {" "}
            {emoji}{" "}
          </span>
        ))
      }
    </div>
  );
}