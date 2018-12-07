# Open Education Platform - V1

An open standard to store and communicate education-related data

## Table of Contents

* [Paths](#paths)
  - [`GET` /](#op-get) 
  - [`HEAD` /](#op-head) 
  - [`GET` /info](#op-get-info) 
  - [`POST` /security/auth/pw](#op-post-security-auth-pw) 
  - [`POST` /security/auth/renew](#op-post-security-auth-renew) 
  - [`GET` /user](#op-get-user) 
  - [`POST` /user](#op-post-user) 
  - [`GET` /user/{uuid}](#op-get-user-uuid) 
  - [`PUT` /user/{uuid}](#op-put-user-uuid) 
  - [`DELETE` /user/{uuid}](#op-delete-user-uuid) 
  - [`GET` /institution](#op-get-institution) 
  - [`POST` /institution](#op-post-institution) 
  - [`GET` /institution/{uuid}](#op-get-institution-uuid) 
  - [`PUT` /institution/{uuid}](#op-put-institution-uuid) 
  - [`DELETE` /institution/{uuid}](#op-delete-institution-uuid) 
* [Schemas](#schemas)
  - 
  - 
  - 
  - 
  - 



<a name="security"></a>
## Security

<table class="table">
  <thead class="table__head">
    <tr class="table__head__row">
      <th class="table__head__cell">Type</th>
      <th class="table__head__cell">In</th>
      <th class="table__head__cell">Name</th>
      <th class="table__head__cell">Scheme</th>
      <th class="table__head__cell">Format</th>
      <th class="table__head__cell">Description</th>
    </tr>
  </thead>
  <tbody class="table__body">
    <tr class="table__body__row">
      <td class="table__body__cell">http</td>
      <td class="table__body__cell"></td>
      <td class="table__body__cell"></td>
      <td class="table__body__cell">bearer</td>
      <td class="table__body__cell">JWT</td>
      <td class="table__body__cell"></td>
    </tr>

  </tbody>
</table>

## Paths


### `GET` /
<a id="op-get" />

> Check endpoint to ensure the application is online and healthy

This is mainly used by load-balancers, but also by clients to check if the application is up and running








#### Responses


##### ▶ 200 - Ok, if everything works fine

###### Headers
_No headers specified_

##### ▶ 500 - Internal server error, if the underlying application has problems

###### Headers
_No headers specified_


#### Tags

<div class="tags">
  <div class="tags__tag"></div>
  <div class="tags__tag"></div>
</div>
</div>

### `HEAD` /
<a id="op-head" />

> Check endpoint to ensure the application is online and healthy

This is mainly used by load-balancers, but also by clients to check if the application is up and running








#### Responses


##### ▶ 200 - Ok, if everything works fine

###### Headers
_No headers specified_

##### ▶ 500 - Internal server error, if the underlying application has problems

###### Headers
_No headers specified_


#### Tags

<div class="tags">
  <div class="tags__tag"></div>
  <div class="tags__tag"></div>
</div>
</div>

### `GET` /info
<a id="op-get-info" />

> Returns info about the API








#### Responses


##### ▶ 200 - API Information

###### Headers
_No headers specified_

###### application/json



<table>
  <thead>
    <tr>
      <th>Name</th>
      <th>Type</th>
      <th>Description</th>
      <th>Accepted values</th>
    </tr>
  </thead>
  <tbody>
      <tr>
        <td>version <strong>(required)</strong></td>
        <td>
          string
        </td>
        <td>Version of the API</td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>openedupVersion <strong>(required)</strong></td>
        <td>
          string
        </td>
        <td>The version fo the openEduPlatform standard used</td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>organization</td>
        <td>
          string
        </td>
        <td>Name or identifier of the providing organization</td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>systemName</td>
        <td>
          string
        </td>
        <td>Returns the name of the system or API</td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>environment</td>
        <td>
          string
        </td>
        <td>Indicates whether this is a test, stage, or production environment</td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>description</td>
        <td>
          string
        </td>
        <td>Prose text describing the current API</td>
        <td><em>Any</em></td>
      </tr>
  </tbody>
</table>



#### Tags

<div class="tags">
  <div class="tags__tag"></div>
</div>
</div>

### `POST` /security/auth/pw
<a id="op-post-security-auth-pw" />

> Issues a new auth token

Issues a new authentication token, if successfully authorized






#### Request body
###### application/x-www-form-urlencoded



<table>
  <thead>
    <tr>
      <th>Name</th>
      <th>Type</th>
      <th>Description</th>
      <th>Accepted values</th>
    </tr>
  </thead>
  <tbody>
      <tr>
        <td>username <strong>(required)</strong></td>
        <td>
          string
        </td>
        <td>Email of the user to login</td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>password <strong>(required)</strong></td>
        <td>
          string
        </td>
        <td>Password to log in</td>
        <td><em>Any</em></td>
      </tr>
  </tbody>
</table>


##### Example _(generated)_

```json
{
  "username": "user@example.com",
  "password": "pa$$word"
}
```




#### Responses


##### ▶ 200 - Successfully authenticated

###### Headers
_No headers specified_

###### application/json



<table>
  <thead>
    <tr>
      <th>Name</th>
      <th>Type</th>
      <th>Description</th>
      <th>Accepted values</th>
    </tr>
  </thead>
  <tbody>
      <tr>
        <td>userUuid <strong>(required)</strong></td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>token <strong>(required)</strong></td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>tokenExpiration</td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
  </tbody>
</table>


##### ▶ 400 - Malformed request or parameter missing

###### Headers
_No headers specified_

##### ▶ 401 - Either username or password was wrong, user is inactive, or blocked

###### Headers
_No headers specified_


#### Tags

<div class="tags">
  <div class="tags__tag"></div>
  <div class="tags__tag"></div>
</div>
</div>

### `POST` /security/auth/renew
<a id="op-post-security-auth-renew" />

> Renow a soon expiring auth token








#### Responses


##### ▶ 200 - Successfully authenticated

###### Headers
_No headers specified_

###### application/json



<table>
  <thead>
    <tr>
      <th>Name</th>
      <th>Type</th>
      <th>Description</th>
      <th>Accepted values</th>
    </tr>
  </thead>
  <tbody>
      <tr>
        <td>userUuid <strong>(required)</strong></td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>token <strong>(required)</strong></td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>tokenExpiration</td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
  </tbody>
</table>


##### ▶ 400 - Malformed request or parameter missing

###### Headers
_No headers specified_

##### ▶ 401 - Either username or password was wrong, user is inactive, or blocked

###### Headers
_No headers specified_


#### Tags

<div class="tags">
  <div class="tags__tag"></div>
  <div class="tags__tag"></div>
</div>
</div>

### `GET` /user
<a id="op-get-user" />

> Get all users

Only users known to authenticated users are returned








#### Responses


##### ▶ 200 - OK

###### Headers
_No headers specified_

###### application/json



<table>
  <thead>
    <tr>
      <th>Name</th>
      <th>Type</th>
      <th>Description</th>
      <th>Accepted values</th>
    </tr>
  </thead>
  <tbody>
      <tr>
        <td>Response</td>
        <td>
          array
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>Response.uuid <strong>(required)</strong></td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>Response.email</td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>Response.active <strong>(required)</strong></td>
        <td>
          boolean
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>Response.firstName</td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>Response.lastName</td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
  </tbody>
</table>



#### Tags

<div class="tags">
  <div class="tags__tag"></div>
  <div class="tags__tag"></div>
</div>
</div>

### `POST` /user
<a id="op-post-user" />

> Create a new user






#### Request body
###### application/json



<table>
  <thead>
    <tr>
      <th>Name</th>
      <th>Type</th>
      <th>Description</th>
      <th>Accepted values</th>
    </tr>
  </thead>
  <tbody>
      <tr>
        <td>uuid <strong>(required)</strong></td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>email</td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>password</td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>active <strong>(required)</strong></td>
        <td>
          boolean
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>firstName</td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>lastName</td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
  </tbody>
</table>


##### Example _(generated)_

```json
{
  "uuid": "string",
  "email": "user@example.com",
  "password": "pa$$word",
  "active": true,
  "firstName": "string",
  "lastName": "string"
}
```




#### Responses


##### ▶ 201 - Successfully created

###### Headers
_No headers specified_

##### ▶ 400 - Malformed request or parameter missing

###### Headers
_No headers specified_

##### ▶ 401 - Unauthorized

###### Headers
_No headers specified_

##### ▶ 404 - Resource not found

###### Headers
_No headers specified_


#### Tags

<div class="tags">
  <div class="tags__tag"></div>
  <div class="tags__tag"></div>
</div>
</div>

### `GET` /user/{uuid}
<a id="op-get-user-uuid" />

> Get a specific user by its UUID

Only users known to authenticated users are returned








#### Responses


##### ▶ 200 - Ok

###### Headers
_No headers specified_

###### application/json



<table>
  <thead>
    <tr>
      <th>Name</th>
      <th>Type</th>
      <th>Description</th>
      <th>Accepted values</th>
    </tr>
  </thead>
  <tbody>
      <tr>
        <td>uuid <strong>(required)</strong></td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>email</td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>active <strong>(required)</strong></td>
        <td>
          boolean
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>firstName</td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>lastName</td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
  </tbody>
</table>


##### ▶ 401 - Unauthorized

###### Headers
_No headers specified_

##### ▶ 404 - Resource not found

###### Headers
_No headers specified_


#### Tags

<div class="tags">
  <div class="tags__tag"></div>
  <div class="tags__tag"></div>
</div>
</div>

### `PUT` /user/{uuid}
<a id="op-put-user-uuid" />

> Change a specific user by its UUID






#### Request body
###### application/json



<table>
  <thead>
    <tr>
      <th>Name</th>
      <th>Type</th>
      <th>Description</th>
      <th>Accepted values</th>
    </tr>
  </thead>
  <tbody>
      <tr>
        <td>uuid <strong>(required)</strong></td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>email</td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>password</td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>active <strong>(required)</strong></td>
        <td>
          boolean
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>firstName</td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>lastName</td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
  </tbody>
</table>


##### Example _(generated)_

```json
{
  "uuid": "string",
  "email": "user@example.com",
  "password": "pa$$word",
  "active": true,
  "firstName": "string",
  "lastName": "string"
}
```




#### Responses


##### ▶ 201 - Successfully updated

###### Headers
_No headers specified_

##### ▶ 400 - Malformed request or parameter missing

###### Headers
_No headers specified_

##### ▶ 401 - Unauthorized

###### Headers
_No headers specified_

##### ▶ 404 - Resource not found

###### Headers
_No headers specified_


#### Tags

<div class="tags">
  <div class="tags__tag"></div>
  <div class="tags__tag"></div>
</div>
</div>

### `DELETE` /user/{uuid}
<a id="op-delete-user-uuid" />

> Delete a specific user by its UUID








#### Responses


##### ▶ 200 - Successfully deleted

###### Headers
_No headers specified_

##### ▶ 400 - Malformed request or parameter missing

###### Headers
_No headers specified_

##### ▶ 401 - Unauthorized

###### Headers
_No headers specified_

##### ▶ 404 - Resource not found

###### Headers
_No headers specified_


#### Tags

<div class="tags">
  <div class="tags__tag"></div>
  <div class="tags__tag"></div>
</div>
</div>

### `GET` /institution
<a id="op-get-institution" />

> Get all institutions

Only institutions known to authenticated users are returned








#### Responses


##### ▶ 200 - OK

###### Headers
_No headers specified_

###### application/json



<table>
  <thead>
    <tr>
      <th>Name</th>
      <th>Type</th>
      <th>Description</th>
      <th>Accepted values</th>
    </tr>
  </thead>
  <tbody>
      <tr>
        <td>Response</td>
        <td>
          array
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>Response.uuid <strong>(required)</strong></td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>Response.name <strong>(required)</strong></td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
  </tbody>
</table>



#### Tags

<div class="tags">
  <div class="tags__tag"></div>
  <div class="tags__tag"></div>
</div>
</div>

### `POST` /institution
<a id="op-post-institution" />

> Create a new institution






#### Request body
###### application/json



<table>
  <thead>
    <tr>
      <th>Name</th>
      <th>Type</th>
      <th>Description</th>
      <th>Accepted values</th>
    </tr>
  </thead>
  <tbody>
      <tr>
        <td>uuid <strong>(required)</strong></td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>name <strong>(required)</strong></td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
  </tbody>
</table>


##### Example _(generated)_

```json
{
  "uuid": "string",
  "name": "string"
}
```




#### Responses


##### ▶ 201 - Successfully created

###### Headers
_No headers specified_

##### ▶ 400 - Malformed request or parameter missing

###### Headers
_No headers specified_

##### ▶ 401 - Unauthorized

###### Headers
_No headers specified_

##### ▶ 404 - Resource not found

###### Headers
_No headers specified_


#### Tags

<div class="tags">
  <div class="tags__tag"></div>
  <div class="tags__tag"></div>
</div>
</div>

### `GET` /institution/{uuid}
<a id="op-get-institution-uuid" />

> Get a specific institution by its UUID

Only institutions known to authenticated users are returned








#### Responses


##### ▶ 200 - Ok

###### Headers
_No headers specified_

###### application/json



<table>
  <thead>
    <tr>
      <th>Name</th>
      <th>Type</th>
      <th>Description</th>
      <th>Accepted values</th>
    </tr>
  </thead>
  <tbody>
      <tr>
        <td>uuid <strong>(required)</strong></td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>name <strong>(required)</strong></td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
  </tbody>
</table>


##### ▶ 401 - Unauthorized

###### Headers
_No headers specified_

##### ▶ 404 - Resource not found

###### Headers
_No headers specified_


#### Tags

<div class="tags">
  <div class="tags__tag"></div>
  <div class="tags__tag"></div>
</div>
</div>

### `PUT` /institution/{uuid}
<a id="op-put-institution-uuid" />

> Change a specific institution by its UUID






#### Request body
###### application/json



<table>
  <thead>
    <tr>
      <th>Name</th>
      <th>Type</th>
      <th>Description</th>
      <th>Accepted values</th>
    </tr>
  </thead>
  <tbody>
      <tr>
        <td>uuid <strong>(required)</strong></td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>name <strong>(required)</strong></td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
  </tbody>
</table>


##### Example _(generated)_

```json
{
  "uuid": "string",
  "name": "string"
}
```




#### Responses


##### ▶ 201 - Successfully updated

###### Headers
_No headers specified_

##### ▶ 400 - Malformed request or parameter missing

###### Headers
_No headers specified_

##### ▶ 401 - Unauthorized

###### Headers
_No headers specified_

##### ▶ 404 - Resource not found

###### Headers
_No headers specified_


#### Tags

<div class="tags">
  <div class="tags__tag"></div>
  <div class="tags__tag"></div>
</div>
</div>

### `DELETE` /institution/{uuid}
<a id="op-delete-institution-uuid" />

> Delete a specific institution by its UUID








#### Responses


##### ▶ 200 - Successfully deleted

###### Headers
_No headers specified_

##### ▶ 400 - Malformed request or parameter missing

###### Headers
_No headers specified_

##### ▶ 401 - Unauthorized

###### Headers
_No headers specified_

##### ▶ 404 - Resource not found

###### Headers
_No headers specified_


#### Tags

<div class="tags">
  <div class="tags__tag"></div>
  <div class="tags__tag"></div>
</div>
</div>

## Schemas

<a id="" />

#### ApiInfo

<table>
  <thead>
    <tr>
      <th>Name</th>
      <th>Type</th>
      <th>Description</th>
      <th>Accepted values</th>
    </tr>
  </thead>
  <tbody>
      <tr>
        <td>version <strong>(required)</strong></td>
        <td>
          string
        </td>
        <td>Version of the API</td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>openedupVersion <strong>(required)</strong></td>
        <td>
          string
        </td>
        <td>The version fo the openEduPlatform standard used</td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>organization</td>
        <td>
          string
        </td>
        <td>Name or identifier of the providing organization</td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>systemName</td>
        <td>
          string
        </td>
        <td>Returns the name of the system or API</td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>environment</td>
        <td>
          string
        </td>
        <td>Indicates whether this is a test, stage, or production environment</td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>description</td>
        <td>
          string
        </td>
        <td>Prose text describing the current API</td>
        <td><em>Any</em></td>
      </tr>
  </tbody>
</table>

##### Example _(generated)_

```json
{
  "version": "string",
  "openedupVersion": "string",
  "organization": "string",
  "systemName": "string",
  "environment": "string",
  "description": "string"
}
```
<a id="" />

#### AuthSuccess

<table>
  <thead>
    <tr>
      <th>Name</th>
      <th>Type</th>
      <th>Description</th>
      <th>Accepted values</th>
    </tr>
  </thead>
  <tbody>
      <tr>
        <td>userUuid <strong>(required)</strong></td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>token <strong>(required)</strong></td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>tokenExpiration</td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
  </tbody>
</table>

##### Example _(generated)_

```json
{
  "userUuid": "string",
  "token": "string",
  "tokenExpiration": "2018-12-07T14:39:05Z"
}
```
<a id="" />

#### User

<table>
  <thead>
    <tr>
      <th>Name</th>
      <th>Type</th>
      <th>Description</th>
      <th>Accepted values</th>
    </tr>
  </thead>
  <tbody>
      <tr>
        <td>uuid <strong>(required)</strong></td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>email</td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>active <strong>(required)</strong></td>
        <td>
          boolean
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>firstName</td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>lastName</td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
  </tbody>
</table>

##### Example _(generated)_

```json
{
  "uuid": "string",
  "email": "user@example.com",
  "active": true,
  "firstName": "string",
  "lastName": "string"
}
```
<a id="" />

#### UserCreate

<table>
  <thead>
    <tr>
      <th>Name</th>
      <th>Type</th>
      <th>Description</th>
      <th>Accepted values</th>
    </tr>
  </thead>
  <tbody>
      <tr>
        <td>uuid <strong>(required)</strong></td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>email</td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>password</td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>active <strong>(required)</strong></td>
        <td>
          boolean
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>firstName</td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>lastName</td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
  </tbody>
</table>

##### Example _(generated)_

```json
{
  "uuid": "string",
  "email": "user@example.com",
  "password": "pa$$word",
  "active": true,
  "firstName": "string",
  "lastName": "string"
}
```
<a id="" />

#### Institution

<table>
  <thead>
    <tr>
      <th>Name</th>
      <th>Type</th>
      <th>Description</th>
      <th>Accepted values</th>
    </tr>
  </thead>
  <tbody>
      <tr>
        <td>uuid <strong>(required)</strong></td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
      <tr>
        <td>name <strong>(required)</strong></td>
        <td>
          string
        </td>
        <td></td>
        <td><em>Any</em></td>
      </tr>
  </tbody>
</table>

##### Example _(generated)_

```json
{
  "uuid": "string",
  "name": "string"
}
```
