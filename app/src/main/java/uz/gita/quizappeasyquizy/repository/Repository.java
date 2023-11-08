package uz.gita.quizappeasyquizy.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import uz.gita.quizappeasyquizy.data.Questions;

public class Repository {

    ArrayList<Questions> questions = new ArrayList<>();
    static Repository repository;

    private Repository(){
        loadQuestins();
    }



    public   static Repository getInstance(){
        if (repository==null)  repository=new Repository();
        return repository;
    }

    public void loadQuestins(){

        questions.add(new Questions("What is the capital of France?", "Paris", "London", "Rome", "Egypt", "Paris"));
        questions.add(new Questions("What is the largest planet in our solar system?", "Jupiter", "Mars", "Saturn", "Venus", "Jupiter"));
        questions.add(new Questions("What is the chemical symbol for gold?", "Gl", "Au", "G", "Ag", "Au"));
        questions.add(new Questions("What is the currency of Japan?", "Dollar", "Euro", "Yen", "Pound", "Yen"));
        questions.add(new Questions("Which country is famous for the Great Wall?", "Japan", "China", "India", "Egypt", "China"));
        questions.add(new Questions("Who is known as the 'Father of Computers'?", "Thomas Edison", "Isaac Newton", "Charles Babbage", "Albert Einstein", "Charles Babbage"));
        questions.add(new Questions("What is the largest ocean in the world?", "Atlantic Ocean", "Pacific Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean"));
        questions.add(new Questions("What is the chemical symbol for water?", "H2O", "CO2", "O2", "NaCl", "H2O"));
        questions.add(new Questions("Which planet is known as the Red Planet?", "Mars", "Venus", "Jupiter", "Saturn", "Mars"));
        questions.add(new Questions("Who painted the famous painting 'Starry Night'?", "Pablo Picasso", "Vincent van Gogh", "Leonardo da Vinci", "Claude Monet", "Vincent van Gogh"));
        questions.add(new Questions("What is the largest mammal in the world?", "Elephant", "Blue Whale", "Giraffe", "Rhinoceros", "Blue Whale"));
        questions.add(new Questions("What is the chemical symbol for oxygen?", "O2", "CO2", "H2O", "O", "O"));
        questions.add(new Questions("Which country is known as the Land of the Rising Sun?", "China", "Japan", "South Korea", "Thailand", "Japan"));
        questions.add(new Questions("Who wrote the play 'Romeo and Juliet'?", "Charles Dickens", "William Shakespeare", "Mark Twain", "Jane Austen", "William Shakespeare"));
        questions.add(new Questions("What is the capital of Italy?", "Paris", "London", "Rome", "Berlin", "Rome"));
        questions.add(new Questions("Which animal is known as the 'King of the Jungle'?", "Elephant", "Lion", "Giraffe", "Zebra", "Lion"));
        questions.add(new Questions("What is the chemical symbol for carbon dioxide?", "CO2", "H2O", "O2", "C", "CO2"));
        questions.add(new Questions("Which planet is closest to the sun?", "Mercury", "Venus", "Earth", "Mars", "Mercury"));
        questions.add(new Questions("What is the currency of the United States?", "Euro", "Dollar", "Yen", "Pound", "Dollar"));
        questions.add(new Questions("Who is the creator of the character Sherlock Holmes?", "Agatha Christie", "Arthur Conan Doyle", "Edgar Allan Poe", "Charles Dickens", "Arthur Conan Doyle"));
        questions.add(new Questions("Who was the first President of the United States?", "George Washington", "Thomas Jefferson", "Abraham Lincoln", "John Adams", "George Washington"));
        questions.add(new Questions("In what year did World War I begin?", "1919", "1917", "1918", "1914", "1914"));
        questions.add(new Questions("Which ancient civilization built the Great Pyramid of Giza?", "Mayans", "Ancient Greeks", "Ancient Romans", "Ancient Egyptians", "Ancient Egyptians"));
        questions.add(new Questions("What event is known as the 'shot heard 'round the world'?", "The start of the American Revolutionary War", "The signing of the Declaration of Independence", "The French Revolution", "The start of World War I", "The start of the American Revolutionary War"));
        questions.add(new Questions("Who wrote 'The Communist Manifesto'?", "Joseph Stalin", "Vladimir Lenin", "Karl Marx and Friedrich Engels", "Leon Trotsky", "Karl Marx and Friedrich Engels"));
        questions.add(new Questions("Which war was fought between the North and the South in the United States?", "American Civil War", "World War II", "Vietnam War", "Korean War", "American Civil War"));
        questions.add(new Questions("In what year did the Titanic sink?", "1912", "1917", "1915", "1914", "1912"));
        questions.add(new Questions("Which famous explorer sailed around the world during the Age of Discovery?", "Ferdinand Magellan", "Christopher Columbus", "Marco Polo", "Vasco da Gama", "Ferdinand Magellan"));
        questions.add(new Questions("Who was the leader of the Soviet Union during the Cuban Missile Crisis?", "Nikita Khrushchev", "Joseph Stalin", "Vladimir Putin", "Mikhail Gorbachev", "Nikita Khrushchev"));
        questions.add(new Questions("Which country was responsible for the construction of the Berlin Wall?", "France", "West Germany", "East Germany", "United Kingdom", "East Germany"));
        questions.add(new Questions("Which battle marked the end of Napoleon Bonaparte's rule as Emperor of France?", "Battle of Waterloo", "Battle of Trafalgar", "Battle of Austerlitz", "Battle of Gettysburg", "Battle of Waterloo"));
        questions.add(new Questions("Who is known for his theory of evolution by natural selection?", "Charles Darwin", "Isaac Newton", "Albert Einstein", "Galileo Galilei", "Charles Darwin"));
        questions.add(new Questions("Which document outlined the principles of the French Revolution and is considered a precursor to human rights?", "Magna Carta", "Declaration of the Rights of Man and of the Citizen", "Emancipation Proclamation", "Bill of Rights", "Declaration of the Rights of Man and of the Citizen"));
        questions.add(new Questions("What was the period of tension between the United States and the Soviet Union during the Cold War called?", "The Cold War", "The Nuclear Conflict", "The Red Scare", "The Space Race", "The Cold War"));
        questions.add(new Questions("Who was the first woman to fly solo across the Atlantic Ocean?", "Amelia Earhart", "Bessie Coleman", "Harriet Quimby", "Sally Ride", "Amelia Earhart"));
        questions.add(new Questions("In what year did the United States declare its independence from Great Britain?", "1789", "1776", "1812", "1865", "1776"));
        questions.add(new Questions("Which ancient civilization was known for its mathematical and architectural achievements, including the Pyramids?", "Ancient Egyptians", "Ancient Greeks", "Ancient Romans", "Mayans", "Ancient Egyptians"));
        questions.add(new Questions("Who was the famous civil rights leader who advocated for nonviolent protest and equality?", "Malcolm X", "Martin Luther King Jr.", "Nelson Mandela", "Rosa Parks", "Martin Luther King Jr."));
        questions.add(new Questions("Which event marked the end of apartheid in South Africa?", "Election of Nelson Mandela as President", "Soweto Uprising", "Sharpeville Massacre", "Boer War", "Election of Nelson Mandela as President"));
        questions.add(new Questions("Which famous explorer is known for discovering the sea route to India?", "Marco Polo", "Christopher Columbus", "Ferdinand Magellan", "Vasco da Gama", "Vasco da Gama"));
        questions.add(new Questions("Who was the first woman to be elected as the Prime Minister of a country?", "Sirimavo Bandaranaike", "Margaret Thatcher", "Angela Merkel", "Golda Meir", "Sirimavo Bandaranaike"));
        questions.add(new Questions("Which document proclaimed that 'all men are created equal' and 'endowed by their Creator with certain unalienable rights'?", "Emancipation Proclamation", "Bill of Rights", "Declaration of Independence", "Magna Carta", "Declaration of Independence"));
        questions.add(new Questions("What was the purpose of the 'Marshall Plan' after World War II?", "To provide economic assistance to rebuild Europe", "To establish a military alliance against the Soviet Union", "To promote nuclear disarmament", "To fund space exploration", "To provide economic assistance to rebuild Europe"));
        questions.add(new Questions("Which European country was ruled by dictator Benito Mussolini?", "France", "Germany", "Spain", "Italy", "Italy"));
        questions.add(new Questions("Who was the founder of the Mongol Empire and is considered one of the greatest military leaders of all time?", "Genghis Khan", "Attila the Hun", "Alexander the Great", "Napoleon Bonaparte", "Genghis Khan"));
        questions.add(new Questions("What was the name of the ship that carried the Pilgrims to the New World in 1620?", "Mayflower", "Santa Maria", "Nina", "Discovery", "Mayflower"));
        questions.add(new Questions("Which war was fought between the Axis Powers and the Allied Powers during World War II?", "World War I", "World War II", "Korean War", "Vietnam War", "World War II"));
        questions.add(new Questions("Who was the Russian monk and mystic who influenced the Russian royal family and was assassinated in 1916?", "Grigori Rasputin", "Vladimir Lenin", "Joseph Stalin", "Nikita Khrushchev", "Grigori Rasputin"));
        questions.add(new Questions("What is the Renaissance known for?", "A period of cultural and artistic rebirth in Europe", "A global exploration of new trade routes", "A series of religious reforms", "A time of political revolutions", "A period of cultural and artistic rebirth in Europe"));
        questions.add(new Questions("In what year did the Berlin Wall fall, leading to the reunification of Germany?", "1990", "1989", "1991", "1987", "1989"));
        questions.add(new Questions("Who was the leader of the civil rights movement in India, known for his philosophy of nonviolent resistance?", "Mahatma Gandhi", "Nelson Mandela", "Martin Luther King Jr.", "Malcolm X", "Mahatma Gandhi"));
        questions.add(new Questions("Which event marked the beginning of the Great Depression in the United States?", "Assassination of Archduke Franz Ferdinand", "End of World War I", "Stock Market Crash of 1929", "Prohibition Era", "Stock Market Crash of 1929"));
        questions.add(new Questions("What was the name of the ship that carried Charles Darwin on his expedition to the Galápagos Islands?", "Santa Maria", "HMS Beagle", "Mayflower", "Discovery", "HMS Beagle"));
        questions.add(new Questions("Who was the Egyptian queen known for her alliance with Julius Caesar and Mark Antony?", "Isis", "Nefertiti", "Hatshepsut", "Cleopatra", "Cleopatra"));
        questions.add(new Questions("Which war was fought between North Korea (supported by China and the Soviet Union) and South Korea (supported by the United Nations and the United States)?", "Cold War", "Vietnam War", "World War II", "Korean War", "Korean War"));
        questions.add(new Questions("Who was the author of 'The Communist Manifesto'?", "Karl Marx and Friedrich Engels", "Vladimir Lenin", "Joseph Stalin", "Leon Trotsky", "Karl Marx and Friedrich Engels"));
        questions.add(new Questions("Which ancient civilization built the city of Machu Picchu?", "Aztec Civilization", "Mayan Civilization", "Inca Civilization", "Egyptian Civilization", "Inca Civilization"));
        questions.add(new Questions("What was the purpose of the 'Trail of Tears' in the 19th century?", "Forced relocation of Native American tribes", "Transcontinental railroad construction", "Underground railroad for escaped slaves", "Pilgrimage to Mecca", "Forced relocation of Native American tribes"));
        questions.add(new Questions("Who was the leader of the Bolshevik Party during the Russian Revolution?", "Nikita Khrushchev", "Joseph Stalin", "Leon Trotsky", "Vladimir Lenin", "Vladimir Lenin"));
        questions.add(new Questions("What event is known as the 'Boston Tea Party'?", "Protest against British taxation on tea", "Celebration of tea production", "Colonial victory in the American Revolution", "Boston's annual tea festival", "Protest against British taxation on tea"));
        questions.add(new Questions("Who was the first female Prime Minister of the United Kingdom?", "Queen Elizabeth II", "Margaret Thatcher", "Angela Merkel", "Indira Gandhi", "Margaret Thatcher"));
        questions.add(new Questions("In what year did the United States drop atomic bombs on the Japanese cities of Hiroshima and Nagasaki?", "1943", "1941", "1945", "1950", "1945"));
        questions.add(new Questions("Which leader of the civil rights movement in the United States is known for his 'I Have a Dream' speech?", "Martin Luther King Jr.", "Malcolm X", "Nelson Mandela", "Rosa Parks", "Martin Luther King Jr."));
        questions.add(new Questions("Which French military and political leader became Emperor of France and is known for his military conquests?", "Louis XIV", "Napoleon Bonaparte", "Marie Antoinette", "Joan of Arc", "Napoleon Bonaparte"));
        questions.add(new Questions("What was the purpose of the Berlin Conference in 1884-1885?", "To divide Africa among European powers", "To negotiate peace treaties after World War I", "To establish the United Nations", "To promote trade with Asia", "To divide Africa among European powers"));
        questions.add(new Questions("Who wrote the famous pamphlet 'Common Sense' that advocated for American independence from British rule?", "John Adams", "George Washington", "Thomas Paine", "Benjamin Franklin", "Thomas Paine"));
        questions.add(new Questions("Which event is considered the beginning of World War II?", "Assassination of Archduke Franz Ferdinand", "Bombing of Hiroshima", "Treaty of Versailles", "Invasion of Poland by Germany", "Invasion of Poland by Germany"));

    }
    public List<Questions> getQuestions(){
        Collections.shuffle(questions);
        return questions.subList(0,5);
    }
    public List<Questions> getQuestions10(){
        Collections.shuffle(questions);
        return questions.subList(0,10);
    }
    public List<Questions> getQuestions15(){
        Collections.shuffle(questions);
        return questions.subList(0,15);
    }
}