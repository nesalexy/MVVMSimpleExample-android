# MVVM not module architect

[![N|Solid](https://upload.wikimedia.org/wikipedia/commons/8/87/MVVMPattern.png?1562272378766)](https://upload.wikimedia.org/wikipedia/commons/8/87/MVVMPattern.png?1562272378766)

Simple project show how you can use mvvm architect. Ouput some data from server. 
Example data:
```sh
    {
        "current_page": 1,
        "max_page": 5,
        "data": [
        {
            "id": 1,
            "name": "Android",
            "surname": "MVVM",
            "description": "some description"
        },
        {
            "id": 1,
            "name": "Android",
            "surname": "MVVM",
            "description": "some description"
        },
        {
            "id": 2,
            "name": "Android",
            "surname": "MVP",
            "description": "some description"
        },

        {
            "id": 3,
            "name": "Android",
            "surname": "MVC",
            "description": "some description"
        },
        {
            "id": 4,
            "name": "Android",
            "surname": "All in Activity",
            "description": "some description"
        }



        ]

    }
```

### Description:
 This project using dagger2, kotlin, okhttp, realm, retrofit, rxjava2, liveData