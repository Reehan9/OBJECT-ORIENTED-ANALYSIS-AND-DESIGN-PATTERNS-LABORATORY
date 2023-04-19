
PART A
Case-study to understand the limitation of traditional Object Oriented Design and appreciate need for Design Patterns. Use UML Notations to design.
You are a fresh analyst deputed to design the software for Decathlon Chain of Stores in Karnataka. You are informed about the Business Logic of Point of Sales criteria by Ms.Veronica Lodge, a dynamic business tycoon operating out of Decathlon Mumbai. She informs you that there are different types of Customers of Decathlon namely, Regular Customers, Senior Citizens and First Time Customers. Regular Customers are given a discount of 12%, Senior Citizens 10% and First Time Customers 15%. Apart from this, based on the sales-index of previous day, a Store-level discount is determined every day. This is dynamic. E.g.Rs.100 off for every purchase above Rs.2000. Using the Object Oriented Principles of Encapsulation, Abstraction, Inheritance, Composition and Aggregation that you have studied until this semester, give at least two ways to design this system.
PART B
Common Case Study for Q#1 to Q#9
‘Decathlon’ is a Sports retail-store started in France. Today it spreads across 22 countries & has 900 outlets in these countries. It has a ‘Point of Sale’ software system called ‘Decathlon POS’, which uses various kinds of 3rd-party software sourced locally from the various countries they are established. You are a software consultant for Decathlon, in Bangalore, with a team of consultants reporting to you. When you analyze your answer for choosing a pattern, explain wherever applicable, keeping in mind the following four design principles:

1.
Separation of concerns
Program to an interface, not a concrete implementation
Prefer composition over inheritance
Open-Close principle (Open for extension, Closed for modification)
Adaptor (Structural): To establish the 1st Decathlon store in Mauritius, you go along with Mr. Satya Nadella, an expert in finding 3rd-party partners. For e.g. a 3rd-party Tax-Calculator system to cater to the specifics of Sales and VAT (Value-added services Tax) tax calculations in different countries. He finds a 3rd-party Tax-Calculator system called ‘MauriTax’ in Port
53
Louis. The problem is, the APIs used by ‘MauriTax’ for tax-calculation is fixed & cannot be changed. The ‘MauriTax’ APIs are incompatible with ‘Decathlon POS’. How will you use the Adaptor Pattern to design & implement?
2. Strategy (Behavioural): How will you use the Strategy Pattern to tackle the limitations of traditional Object Oriented Design highlighted in PART A? The design must handle varying price-schemes having different pricing algorithms. Design & implement.
3. Factory Method (Creational): The ‘Decathlon POS’ software system classifies its customers as senior-citizens (60 and above), First-Time customers, Regular Customers. There is a very high possibility that the Customer Type hierarchy will vary, depending upon the sales-pattern. For e.g. there could be the need to introduce new categories based on the customer gender, different age groups for kids (0-5, 6-12), teenagers (13-19) and age groups between 20 to 60(Twenties, 30s, 40s and 50s). You are advised by Mr.Sundar Pichai, the technical architect of your team, whom you trust, to use Factory Method Pattern in order to instantiate the above Customer Type hierarchy of concrete implementation of objects. Design and implement using this.
4. Bridge (Structural): You get a call from Ms.Masaba Gupta of Bangalore Decathlon office that there is a policy decision made globally to introduce discount slabs for a whole month twice in a year. The discount month will be in January and July after reviewing the sales made from Feb to June (first five months) and Aug to December (last five months) respectively. It is decided to provide four slabs of discounts in 2017, namely, 30%, 25%, 20% and 15%, based on the sports item purchased. For e.g. all tennis rackets could have a 20% discount while cricket bats could only have a 15% discount. All exercise tread-mills could be given a 30% discount while boxing-gloves could have a 25% discount. Point to be noted here is that, the slabs of discount may not remain the same in 2018. It is likely to vary year after year. The ‘Decathlon POS’ software system classifies its customers as Senior-Citizens (60 and above), First-Time Customers, Regular Customers as of now. There is a very high possibility that the Customer Type hierarchy will vary, depending upon the sales-pattern. For e.g. there could be the need to introduce new categories based on the customer gender.
Use the Bridge Pattern to design & implement, so that both the Customer Type hierarchy of classes as well as the Discount Percentage hierarchy of classes can both vary independently? That is, they are not tied to each other.
5. Observer (Behavioural): There will be different discounts being offered for the sports items in Decathlon Stores across the globe for different festivals being celebrated in the various countries these stores are established. Assume that the Decathlon Chain of Stores fixes a particular discount slab for its items for a festival of a country.
Use the Observer Pattern to design and implement a system to notify the customers of the Decathlon stores of that country about the various festival / seasonal discount rates as and when they are announced.
54

6. Façade (Structural): You get a call from Ms.Betty Cooper of Bangalore Decathlon office that there is a policy decision made globally to incorporate some new rules for ‘Process Sale Use- Case’. For e.g. if payment is made via gift-certificate, the customer can buy only one item for the amount in the certificate. No other items can be bought with that gift-certificate. There must be no cash-back to the customer if the item costs less than amount specified in the gift- certificate. If the item costs more, the excess payment can be accepted via cash only & not credit / debit cards. When a new sale is created, these rules must become effective. You come to know from Mr. Satya Nadella, an expert in finding 3rd-party partners, that the Italian Competitor for Decathlon called ‘Sport 2000’ has a ready-made ‘rule-engine’ sub-system for this, whose specific implementation details is not known yet, as the business heads of Decathlon & Sport 2000 are chalking out the software purchase terms. This Sport 2000 rule-engine will be responsible for evaluating a set of rules against an operation & indicating if any of the rules invalidated the operation (e.g. ‘makeNewSale’ operation).
How will you use the Façade pattern to provide a common unified interface to a dissimilar set of implementations, developed by a 3rd-party vendor, the implementation details are not known to you?
7. Abstract Factory (Creational): As an analyst in charge of designing the Decathlon POS Software, you realize the need to streamline the creation of objects belonging to different products in the Decathlon store. There are two major categories of products:
a) For differently abled sports enthusiasts
b) For able-bodied sports enthusiasts
In each of the above categories there are products for outdoor adventure sports
(e.g. trekking, para-gliding, bungee-jumping etc.), outdoor regular games (cricket, football, baseball etc.) indoor regular games (table tennis, squash etc.). There is a possibility of further class/object instantiation explosion with categories such as male & female sports enthusiasts and different equipment for them. Objects need to be instantiated based on these categories. Design & implement using Abstract Factory.
8. Decorator (Behavioural – Structural according to GoF): There is an existing interface method in the Decathlon POS software system called ‘getCurrentStock’ which is implemented by two concrete classes ‘IndoorSports’ and ‘OutdoorSports’, to get the number of stocks for the sports items belonging to these respective categories. On studying the Decathlon POS system, you as an analyst realize the need to get sports stock update of various items within:
Indoor Sports - ‘GamesOnTable’ (e.g. Table Tennis, Billiards, Snooker etc.) ‘BoardGames’ (e.g. Carom, Chess etc.)
‘CourtGames’ (e.g. Basketball, Badminton, Kabaddi etc.) Outdoor Sports - ‘AdventureGames’ (e.g. trekking, para-gliding, bungee-
jumping etc.)
‘StadiumGames’ (e.g. cricket, football, baseball etc.) ‘Athletics’ (e.g. different distances for running, high jump etc.)


Use the Decorator pattern, decorating the ‘get Current Stock’ method to
Design and implement this scenario.
9. Template Method (Behavioural): To keep up with the customer convenience of online
ordering Decathlon Chain of stores decides to have two modes of order-processing, namely ‘online’ and ‘offline’. Both modes have the same processing steps for order-processing, namely ‘selectItem’, ‘doPayment’ and ‘doDelivery’. But, the way these steps are done varies between the two modes.
selectItem – online – gives tabular depiction of price comparison of the item chosen. Offline – allows trying out of the items in the store
do Payment – online – net-banking payment; offline – pays through cash / swipe-card doDelivery – online – needs to pay the charges for shipping & delivery address; offline – collect at the counter.
Show how you as the analyst will use the Template Method pattern to
design and implement this.
10. Singleton (Creational): A Browser’s history has data of all the visited URLs across all tabs
and windows of a browser. The history is saved such that the data persists even after closing the browser. How would you use Singleton Pattern to implement Browser History such that on visiting a URL on any open tab of a browser the URL gets added to the existing history?
Text Book:
1. Alan Shalloway, James R Trot, “Design Patterns Explained – A New Perspective on Object- Oriented Design”, Pearson, 2nd Edition, 4th 
2.Impression 2010.
References:
1. Eric Freeman, Elisabeth Freeman, “Head First Design Patterns”, O’reilly Publications, October 2004, 1st Edition
2. Satzinger, Jackson, Burd, “Object Oriented Analysis and Design with Unified Process”, Thomson Learning, 1st Indian Reprint 2007.
