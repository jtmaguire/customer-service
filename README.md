# Customer Service

A simple CRUD api service connecting to a postgres database, to be used for future learning projects.

Built with;
- Spring boot
- Liquibase
- Postgres

## API Endpoints

### Create

` POST /customers/create`

Required body:
`````
{
    "firstName" : "john",
    "surname": "doe",
    "dateOfBirth":"01-01-2000",
    "emailAddress": "johndoe@mail.com"
}
`````

Expected response:
`````
{
    "firstName" : "john",
    "surname": "doe",
    "dateOfBirth":"01-01-2000",
    "emailAddress": "johndoe@mail.com",
    "id": 1
}
`````

### Read - all

` GET /customers/all`

Expected response:
`````
[
    {
        "firstName" : "john",
        "surname": "doe",
        "dateOfBirth":"01-01-2000",
        "emailAddress": "johndoe@mail.com",
        "id": 1
    },
...
]
`````

### Read - by ID

` GET /customers/{ID}`

Expected response:
`````
{
    "firstName" : "john",
    "surname": "doe",
    "dateOfBirth":"01-01-2000",
    "emailAddress": "johndoe@mail.com",
    "id": 1
}
`````

### Update

` PUT /customers/update/{ID}`

Required body:
`````
{
    "firstName" : "john",
    "surname": "doe",
    "dateOfBirth":"01-01-2000",
    "emailAddress": "johndoe@mail.com",
    "id": 1
}
`````

Expected response:
`````
{
    "firstName" : "john",
    "surname": "doe",
    "dateOfBirth":"01-01-2000",
    "emailAddress": "johndoe@mail.com",
    "id": 1
}
`````

### Delete

` DELETE /customers/delete/{ID}`

Expected response:

`200 Response`