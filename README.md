# uf_api
A list of documentation and example code to access the University of Florida's public (undocumented) API

[Courses](#courses)

[Gym](#gym)

[Common Data](#common-data) (admissions and whatnot)

[Gators Football Schedule](#gators-football-schedule)

[Campus Map Data](#campus-map-data)

# Contributing/Issues
Fork the repository and make a change. Submit a pull request and it will be promptly approved.

If you don't want to do that, feel free to open an issue.

## Courses
This documents some of the API calls that can be made to get UF's course information

#### BaseURL
[GET] `https://one.ufl.edu/apix/soc/schedule/[parameters]`

`term` and `category` are required. `last-row` is highly suggested

Sample call:
```
Bare Minimum:
https://one.ufl.edu/apix/soc/schedule/?category=RES&term=20165

Complex:
https://one.ufl.edu/apix/soc/schedule/?category=RES&course-code=&course-title=&cred-srch=&credits=&day-f=&day-m=&day-r=&day-s=&day-t=&day-w=&days=false&dept=+&eep=&fitsSchedule=false&ge=&ge-b=&ge-c=&ge-d=&ge-h=&ge-m=&ge-n=&ge-p=&ge-s=&instructor=&last-row=0&level-max=--&level-min=--&no-open-seats=false&online-a=&online-c=&online-h=&online-p=&period-b=&period-e=&prog-level=+&term=20181&var-cred=true&writing=
```

### Parameters
Appended to the BaseURL as `parameter=value1&parameter2=value2` ...

#### Semester/Term (Required)
Set which term to find courses i.e Spring 2018 

```Term=20181```

Variable = [Year][Semester number]
```
Spring: 1
Summer: 5
Fall: 8
```

#### Program/Category (Required)
Type of program course
```Category=RES```

```
RES: Campus/Web/Special Program (Regular)
UFO: UF online program
IA: Innovation Academy
HUR: USVI and Puerto Rico
```

#### Number of Results (Required)
This API limits the number of returned courses to 50. In order to get results 51-100 you must set `last-row=50`.

The JSON response from the API includes the last row and total number of rows as of the results as 

```
[
  {
    "COURSES":[],
    "LASTROW": [number]
    "TOTALROWS": [number]
  }
]
```

#### COURSE CODE
`course-code=eel3135`
This parameter lets you pass the course code as a parameter

#### COURSE TITLE

#### Day of the week
List of true false, depending on availability
```
day-m: Monday
day-t: Tuesday
day-w: Wednesday
day-r: Thursday
day-f: Friday
day-s: Saturday/Sunday
```
If you want to check days you must pass [boolean] `days=(false)`

#### eep, cred-srch, credits

#### Credits
Specify the number of credits for the course
`credits=[number]`

#### Gen-Ed Requirements
List of possible gen-ed requirements.
Must pass `ge`
```
ge-b: ... To do ...
ge-c:
ge-d:
ge-h:
ge-m:
ge-n:
ge-p:
ge-s:
```

#### Instructor
To be explored

#### Open seats
`no-open-seats=false`

To be explored

## Gym

#### Live Cameras at SWRC and Student Rec
Live cameras placed in SouthWest Rec Center update images once every second. Old images are replaced.

#### SRFC (Student) Weight Room
[GET] `http://recsports.ufl.edu/cam/cam6.jpg`

#### SWRC (Southwest) Weight Room 1
[GET] `http://recsports.ufl.edu/cam/cam1.jpg`

#### SWRC Weight Room 2
[GET] `http://recsports.ufl.edu/cam/cam3.jpg`

#### SWRC Cardio
[GET] `http://recsports.ufl.edu/cam/cam4.jpg`

#### SWRC Basketball Courts 1 - 4
[GET] `http://recsports.ufl.edu/cam/cam2.jpg`

#### SWRC Basketball Courts 5 - 6
[GET] `http://recsports.ufl.edu/cam/cam5.jpg`

## Common-Data

https://ir.aa.ufl.edu/reports/common-data-set/

These are all pdfs which contain demographic information on UF's student body

## UF Calendar Events
```https://ufl.lwcal.com/live/calendar/view/week?user_tz=America%2FDetroit&syntax=%3Cwidget%20type%3D%22events_calendar%22%3E%3Carg%20id%3D%22modular%22%3Etrue%3C%2Farg%3E%3Carg%20id%3D%22default_view%22%3Eweek%3C%2Farg%3E%3Carg%20id%3D%22month_view_day_limit%22%3E3%3C%2Farg%3E%3Carg%20id%3D%22show_sidebar%22%3Efalse%3C%2Farg%3E%3Carg%20id%3D%22mini_cal_heat_map%22%3Etrue%3C%2Farg%3E%3Carg%20id%3D%22thumb_width%22%3E160%3C%2Farg%3E%3Carg%20id%3D%22thumb_height%22%3E160%3C%2Farg%3E%3Carg%20id%3D%22show_groups%22%3Etrue%3C%2Farg%3E%3Carg%20id%3D%22show_tags%22%3Etrue%3C%2Farg%3E%3Carg%20id%3D%22development%22%3Etrue%3C%2Farg%3E%3C%2Fwidget%3E```

To be explored

## UF Alerts
``` https://lists.ufl.edu/cgi-bin/wa?RSS&L=UF-ALERT-GAINESVILLE&v=2.0 ```

Returns XML element. Currently uses RSS

To be explored

## UF Crime Log
```http://www.police.ufl.edu/wp-content/asp/crimelog/default2.asp```
No API but could be super easy to scrape

To be explored

## Voting Data
To be explored

## Campus Map Data
Location and metadata about places on campus that may be useful for creating a map app.

### Base URL
```https://campusmap.ufl.edu/library/cmapjson/[resource]```

For example, to get the JSON array of all bus stops: https://campusmap.ufl.edu/library/cmapjson/bus_stops.json

#### Resource Values
- Buildings (No LAT/LON values): geo_buildings.json
- Buildings (Contains LAT/LON values): search.json

- Sports Fields: sport_fields.json
- Urban Parks: urban_parks.json
- Natural Areas: natural_areas.json
- Construction: construction.json

- Accessible Entrances: ada_entrance.json
- Other Entrances: other_entrances.json
- ADA Parking: ada_parking.json
- ADA Routes: ada_paths.json
- Bus Stops: bus_stops.json

- SNAP Locaions: snap.json
- AEDs: aed.json
- Blue Phones: blp.json
- Outdoor Speakers: spkrs.json

- Walk-up Computers: computerlabs.json
- Walk-up Printers: printers.json
- Videoconferencing: video.json
- Wireless Coverage: wireless.json

- Dining: dining.json

- Historic District: historic_district.json
- Registered Locations: historic_register.json

- Housing: housing.json

- Libraries: library.json
- Study Rooms: study.json
- Open Study Areas: study_open.json

- Decaled Parking: parking_lots.json
- ADA Parking: ada_parking.json
- Carpool Parking: carpool.json
- Metered Parking: meters.json
- Scooter/Motorcycle Zone: scooters.json
- Zip Cars: zip_car.json
- EV Charging: ev_charging.json

- Places of Interest: poi.json

- Health & Wellness Services: health.json
- Locatation Rooms: lactation.json
- Recreation & Fitness: recfit.json

- Student ServicesL student.json

#### Linking to the Map
```
You can link directly to a building or other point of reference by following the example URL: http://campusmap.ufl.edu/#/index/0001/17 

The first parameter (a four digit code) should be the building number or the object ID to center the map on. The second parameter (a two digit number) should be the desired zoom level. If no zoom level is given the default will be 17.
```
