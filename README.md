Animal CRUD API

This REST API performs CRUD operations on Animal objects.

Get an Animal by ID

  GET /animals/{animalId}
  http://localhost:8080/animals/1

  {
    "animalId": 1,
    "name": "Lion",
    "species": "Panthera leo",
    "habitat": "Savanna",
    "description": "The king of the jungle."
  }

  POST /animals/new

  http://localhost:8080/animals/new
  {
    "name": "Giraffe",
    "species": "Giraffa camelopardalis",
    "habitat": "Savanna",
    "description": "The tallest land animal."
  }

  PUT /animals/update/{animalId}

  http://localhost:8080/animals/update/1

  {
    "name": "Updated Lion",
    "species": "Panthera leo",
    "habitat": "Savanna",
    "description": "Updated description."
  }
  {
    "animalId": 1,
    "name": "Updated Lion",
    "species": "Panthera leo",
    "habitat": "Savanna",
    "description": "Updated description."
  }

  DELETE /animals/delete/{animalId}

  http://localhost:8080/animals/delete/1
