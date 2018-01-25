# uf_api
A list of documentation and example code to access the University of Florida's public (undocumented) API

[Courses](#Courses)

[Gym](#Gym)

[Common Data] (#Common-Data) (admissions and whatnot)

# Contributing
Fork the repository and make a change. Submit a pull request and it will be promptly approved.

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
Set which term you're interested in finding courses for i.e Spring 2018 

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