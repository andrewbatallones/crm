# CRM Server

This will be a very basic implementation of a CRM. As I build more of it out, 
I want to get a finished product up (for people to download and use).
I'll be documenting as much as I can in terms of what technologies I'll use as well as hopefully
a better understanding of Java.

## Setup

### MySQL

You can run the following command to get a local instance of MySQL running on Docker

```bash
docker run -d \
  --name crm-mysql \
  -e MYSQL_ROOT_PASSWORD=root_password \
  -e MYSQL_USER=crm \
  -e MYSQL_PASSWORD=password \
  -e MYSQL_DATABASE=crm \
  -p 3306:3306 \
  mysql:latest
```

Required Stuff
- Teams (an account can manage multiple sales teams)
- Employees
  - Manager
- Users
  - Owner
- Customers
  - Addresses
  - Notes
- Products
- Orders
  - shipping address
  - billing address
  - notes

Extra stuff if I can finish the simple stuff
- Integration with ecommerce sites (Bigcommerce, Shopify)
  - Basically will be able to sync customers / orders
  - Maybe products? (but now that is getting to another app - product management, which may be a good second project).
