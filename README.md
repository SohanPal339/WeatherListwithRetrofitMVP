# WeatherListwithRetrofitMVP
Weather list with retrofit and mvp pattern



Assessment for Last 5 days weather display (Android-Mobile)


There are some details about assessment which I have done. Details are given below with points.


Used url:-  I am using below url for getting last five days weather.
https://samples.openweathermap.org/data/2.5/forecast?q=M%C3%BCnchen,DE&appid=b6907d289e10d714a6e88b30761fae22


UI Part:-
1.	There is only one Activity where I am displaying data for weather.
2.	I am displaying these data main, description and date time from list json array.


Coding Part:-
1.	Worked on MVP Pattern with retrofit
2.	 In gradle file, I have added some dependencies, like RecyclerView cardview, retrofit, retrofit-converter-gson.
3.	Used RecylerView
4.	 Completed coding part in 2 hours only.
5.	I have created some packages for separating code like Adapter, Model, Presenter and View.
6.	In Adapter Package, there is a class WeatherAdapter, which is using for display the weather list. 
7.	In Model Package, created one interface and 4 class. Interface is used for get api call and all classes are used for get the data from server.
8.	In Presenter package, created one interface and 2 classes. Interface is used for get call back data. In classes, one class Intractor is used for creating the retrofit instance and call api and other class is Presenter, which is used to trigger the method to update UI
9.	In View package, created a MainActivity where we are displaying the UI part.
