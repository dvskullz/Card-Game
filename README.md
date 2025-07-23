# ♠️ Blackjack Card Game Engine 🎮

A fully functional **Blackjack game engine** built in Java using **Object-Oriented Programming (OOP)** principles. This console-based implementation simulates a real Blackjack game between a player and the dealer, complete with card dealing, scoring logic, and winner determination.

---

## 🧠 Why I Built This

I created this project as a **personal challenge** to solidify my understanding of **core OOP concepts** in Java such as:

- Encapsulation
- Inheritance
- Abstraction
- Polymorphism

Instead of just reading theory, I wanted to apply these concepts in a fun and interactive way — and what better way than building a game?

---

## 🃏 Features

- 🔁 Turn-based gameplay between player and dealer
- ♣️ Standard 52-card deck with shuffling
- 🃠 Full card representation (suit, rank, value)
- 🎯 Accurate Blackjack score calculation (including Aces logic)
- 🖥 Console interaction using Java Scanner
- 🧪 Test-friendly and modular OOP structure

---

## 🚀 What's Next?

If in mood i might plan to extend this game engine to support:

   GUI using JavaFX or Swing

   Multiplayer logic

   Betting system


## 📂 Project Structure
 <pre> Card-Game/
├── src/                      # Source files (Java code)
│   ├── blackJack.java        # Main game logic and entry point
│   ├── card.java             # Card class: suit, rank, value
│   ├── deck.java             # Deck class: builds & shuffles deck
│   └── player.java           # Player class: hand & actions
│
│
├── Card Game.iml             # IntelliJ project file
└── README.md                 # Project overview and instructions
 </pre> 


---

## ▶️ How to Run
 <pre> 
1. C**lone the repository:**
   
   https://github.com/dvskullz/Card-Game.git

    cd blackjack-game-engine

3. **Compile all files:**

   javac *.java

4. **Run the game:**

   java BlackJack
  </pre> 

## 📸 Gameplay Preview
<pre>
=== Blackjack ===
You drew: 9 of Hearts, King of Spades
Dealer shows: 7 of Clubs
Your current score: 19
Do you want to [H]it or [S]tand? s

Dealer's turn:
Dealer has: 7 of Clubs, 5 of Hearts
Dealer hits.
Dealer has: 7 of Clubs, 5 of Hearts, King of Diamonds

Final Scores:
Your score: 19
Dealer score: 22
You win!
 </pre>


