# CRM Server

This will be a very basic implementation of a CRM. As I build more of it out, 
I want to get a finished product up (for people to download and use).
I'll be documenting as much as I can in terms of what technologies I'll use as well as hopefully
a better understanding of Java.

**Initial Model Structure**
- [ ] Teams (an account can manage multiple sales teams)
- [ ] Employees
- [ ] Users
- [ ] Customers
  - Addresses
  - Notes
- [ ] Prospects: Essentially, they'll be customers w/o any orders.
- [ ] Products
- [ ] Orders
  - Order Items
  - Shipping Address
  - Billing Address
  - Notes

**Extra stuff if I can finish the simple stuff**

- [ ] Shopify Integration
    - [ ] Orders
    - [ ] Customers
    - [ ] Products

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

## Development

To run the server, you can run this command or should be able to auto-run it on any code editor.

```bash
./gradlew bootRun
```
