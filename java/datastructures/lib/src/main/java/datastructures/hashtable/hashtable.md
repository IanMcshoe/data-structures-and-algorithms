# Hashtables
A hash table is a type of data structure that stores key-value pairs. The key is sent to a hash function that performs arithmetic operations on it. The result (commonly called the hash value or hash) is the index of the key-value pair in the hash table.

## Challenge
**set**

- Arguments: key, value
- Returns: nothing


This method should hash the key, and set the key and value pair in the table, handling collisions as needed.
Should a given key already exist, replace its value from the value argument given to this method.

**get**

- Arguments: key
- Returns: Value associated with that key in the table


**has**

- Arguments: key
- Returns: Boolean, indicating if the key exists in the table already.


**keys**

- Returns: Collection of keys


**hash**

- Arguments: key
- Returns: Index in the collection for that key

## Whiteboard




## Approach & Efficiency

![2022-12-01](https://user-images.githubusercontent.com/108303424/204981642-befe9326-b7b1-4bdd-ab1e-e5fcb4a662b2.png)

## API

**add**

- Takes in both the key and value. This method should hash the key, and add the key and value pair to the table, handling collisions as needed.


**get**

- Takes in the key and returns the value from the table.


**contains**

- Takes in the key and returns a boolean, indicating if the key exists in the table already.


**keys**


**hash**

- Takes in an arbitrary key and returns an index in the collection.

