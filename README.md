# HuynhTrieuPhu-20076921-Java-WWW-week7
## Mô tả:
Một công ty cần viết một ứng dụng web cho công việc bán hàng của họ. Thông tin cần lưu trữ bao gồm:
- employee (emp_id, full_name, dob, email, phone, address, status)
- product (product_id, name, description, unit, manufacturer_name, status)
- customer (cust_id, cust_name, email, phone, address)
- product_image (product_id, image_id, path, alternative)
- order (order_id, order_date, emp_id, cust_id)
- order_detail (order_id, product_id, quantity, price, note)
- product_price (product_id, price_date_time, price, note) </br>
Diễn giải:
- Một product có nhiều image, một image thuộc về một product. Status chỉ trạng thái kinh doanh 
của sản phẩm: 1- đang kinh doanh, 0 - tạm ngưng, -1 - không kinh doanh nữa.
- Employee có status: 1- đang làm việc, 0 - tạm nghỉ, -1 – nghỉ việc.
- Một order có nhiều order_detail, một order_detail thuộc về một order.
- Một order thuộc về một employee, một employeecó nhiều order.
- Một customer có nhiều order, một order chỉ thuộc một customer.
- Một product_detail có một giá (price) được lưu trong product_price. Một giá được xác định 
bằng product_id và price_date_time. Tại thời điểm lập order, giá được lấy với price_date_time 
gần nhất.
## Chức năng:
- CRUD cho product
- THống kế theo thời gian (đang cập nhật)
- THống kê theo order theo nhân viên (đang cập nhật)
## Hướng dẫn sử dụng:
* Cấu hình project:
  ![image](https://github.com/Genzi135/HuynhTrieuPhu-20076921-Java-WWW/assets/104980263/4f65964a-9176-46a4-892e-8011ba5855fc)
* Run project:
  ![image](https://github.com/Genzi135/HuynhTrieuPhu-20076921-Java-WWW/assets/104980263/6988d65a-16b1-4af6-b397-8d1f3e41efa0)
## Database diagram:
![image](https://github.com/Genzi135/HuynhTrieuPhu-20076921-Java-WWW/assets/104980263/819a4154-c0ae-42ce-8f3a-d8eb8d94ec35)

## Kết quả khi chạy project
### Xem danh sách
* Hiển thị danh sách sản phẩm
  ![image](https://github.com/Genzi135/HuynhTrieuPhu-20076921-Java-WWW/assets/104980263/c00e0b46-115d-4327-9ee6-af7cd1155483)
### Thêm sản phẩm
* Để thêm sản phẩm mới vào danh sách thì click vào "Thêm sản phẩm mới"
  ![image](https://github.com/Genzi135/HuynhTrieuPhu-20076921-Java-WWW/assets/104980263/0beac4a8-e5ef-4b0b-b2de-9967be7e14ac)
* Form thêm sản phẩm mới: ![image](https://github.com/Genzi135/HuynhTrieuPhu-20076921-Java-WWW/assets/104980263/6c4d9694-af31-4740-8bde-eaafd1ed8b8d)
* Sau khi nhập đầy đủ thông tin sản phẩm, chọn Add product: ![image](https://github.com/Genzi135/HuynhTrieuPhu-20076921-Java-WWW/assets/104980263/12c7d851-4a0f-4a2a-8e47-bf5f55cb691c)
* Nhập giá và thêm ghi chú của sản phẩm: ![image](https://github.com/Genzi135/HuynhTrieuPhu-20076921-Java-WWW/assets/104980263/ff9d7b99-0384-496c-9cbd-83b95bcfa176)
* Chọn "Add Price" để hoàn tất việc thêm sản phẩm: ![image](https://github.com/Genzi135/HuynhTrieuPhu-20076921-Java-WWW/assets/104980263/dd4e4f79-d374-44df-be70-00f898c402e8)
### Cập nhật sản phẩm
* Để cập nhật sản phẩm chọn vào update ở ô Link: ![image](https://github.com/Genzi135/HuynhTrieuPhu-20076921-Java-WWW/assets/104980263/234c06ae-2083-48e5-9144-334a5ef6948c)
* Thay đổi các thông tin ở form: ![image](https://github.com/Genzi135/HuynhTrieuPhu-20076921-Java-WWW/assets/104980263/13b4b781-edce-40f0-b041-b69a85ffbe64)
* Chọn Submit để cập nhật lại thông tin sản phẩm: ![image](https://github.com/Genzi135/HuynhTrieuPhu-20076921-Java-WWW/assets/104980263/2724081e-b924-4942-9c9f-ba185bc322e0)
### Xóa sản phẩm
* Chỉ cần chọn vào ô Delete ở Link là sản phẩm sẽ được xóa: ![image](https://github.com/Genzi135/HuynhTrieuPhu-20076921-Java-WWW/assets/104980263/9a856de9-6a9c-4c62-92ce-d0b5040035d2)

  

