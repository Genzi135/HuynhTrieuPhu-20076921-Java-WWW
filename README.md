# HuynhTrieuPhu-20076921-Java-WWW
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
- THông kế theo thời gian (đang cập nhật)
- THông kê theo order theo nhân viên (đang cập nhật)
## Hướng dẫn sử dụng:
Cấu hình project: ![image](https://github.com/Genzi135/HuynhTrieuPhu-20076921-Java-WWW/assets/104980263/72e944cd-75f1-4d9c-a79d-584884fd732c)
Run Test để khởi tạo database và thêm dữ liệu có sẵn: ![image](https://github.com/Genzi135/HuynhTrieuPhu-20076921-Java-WWW/assets/104980263/ee5ee530-2d49-48a9-a5d7-f667d8b5acb1) </br>
Sau đó chạy project bằng TomCat10.1.13: ![image](https://github.com/Genzi135/HuynhTrieuPhu-20076921-Java-WWW/assets/104980263/3d09e4cc-c453-4600-9360-ad3ed35debb3)

## Database diagram:
![image](https://github.com/Genzi135/HuynhTrieuPhu-20076921-Java-WWW/assets/104980263/a6192e83-3a52-4bed-a2b1-6f96b53c2f9f)

## Kết quả khi chạy project:
Trang bắt đầu như sau: ![image](https://github.com/Genzi135/HuynhTrieuPhu-20076921-Java-WWW/assets/104980263/1bbea317-28d3-42d3-910a-e99a80472e04)
</br> Admin-> quản lý sản phẩm
</br> Employee -> mua hàng
#### Product List: 
</br>

![image](https://github.com/Genzi135/HuynhTrieuPhu-20076921-Java-WWW/assets/104980263/71f25a5f-f995-461e-bfce-262f2c3ff258)
* Thêm product: click
   ![image](https://github.com/Genzi135/HuynhTrieuPhu-20076921-Java-WWW/assets/104980263/c91ee34e-dfa7-4cca-b8d1-ecac2b0472ea)
</br> Nhập thông tin sản phẩm mới vào form: </br>

![image](https://github.com/Genzi135/HuynhTrieuPhu-20076921-Java-WWW/assets/104980263/c0572f3c-91e9-405e-91df-ace5d74fa69c)

Sau khi nhập đầy đủ thông tin, click insert để thêm sản phẩm mới và đưa dữ liệu xuống database. Nút clear để xóa thông tin và nhập lại
</br> ![image](https://github.com/Genzi135/HuynhTrieuPhu-20076921-Java-WWW/assets/104980263/4e949724-629d-421d-9e16-39bc37466f31) </br>

* Cập nhật prođuct: click ![image](https://github.com/Genzi135/HuynhTrieuPhu-20076921-Java-WWW/assets/104980263/5da24df7-9d4c-4170-9cc6-aa583467a4c6)
  
</br> Form sẽ chứa sẵn thông tin của sản phẩm được chọn để cập nhật thông tin: </br>

![image](https://github.com/Genzi135/HuynhTrieuPhu-20076921-Java-WWW/assets/104980263/3ba9f0f6-1c4d-4e7c-86d9-064a74f005d0)

</br>

Sau khi chỉnh sửa thông tin click update để cập nhật, click clear để xóa hết thông tin trên form và nhập lại: </br>
![image](https://github.com/Genzi135/HuynhTrieuPhu-20076921-Java-WWW/assets/104980263/8698e876-3085-4412-93a9-f4c0a3c9b955)
* Xóa sản phẩm: click ![image](https://github.com/Genzi135/HuynhTrieuPhu-20076921-Java-WWW/assets/104980263/d320c3b0-1eec-47be-891b-1b439e2eabf2)

#### Shopping:
Sau khi click vào sẽ hiện ra form để customer nhập thông tin của họ: </br>
![image](https://github.com/Genzi135/HuynhTrieuPhu-20076921-Java-WWW/assets/104980263/efa6ae0f-a8ed-4884-86c4-81f93d0ba8cd)
</br> Nếu là khách hàng mới thì click để lưu lại thông tin:

![image](https://github.com/Genzi135/HuynhTrieuPhu-20076921-Java-WWW/assets/104980263/dedd16a5-9752-4eee-84b1-0c820545f979)
</br> Nhập thông tin và click submit để vào trang mua hàng:

![image](https://github.com/Genzi135/HuynhTrieuPhu-20076921-Java-WWW/assets/104980263/89bfc068-a101-4535-854a-531866a97452)
</br> Trang mua hàng: </br>

![image](https://github.com/Genzi135/HuynhTrieuPhu-20076921-Java-WWW/assets/104980263/fd8f4e1d-92c8-4d66-ae9a-a6e85472a412)


</br>

Và một giỏ hàng rỗng: </br> 

![image](https://github.com/Genzi135/HuynhTrieuPhu-20076921-Java-WWW/assets/104980263/a4c29376-62f4-4dc2-9314-435000044c68)


</br> Để thêm sản phẩm vào giỏ hàng click: 
![image](https://github.com/Genzi135/HuynhTrieuPhu-20076921-Java-WWW/assets/104980263/7d25513f-d6f9-4cea-81d5-277e940f7fc6)

</br>
![image](https://github.com/Genzi135/HuynhTrieuPhu-20076921-Java-WWW/assets/104980263/1e065594-9a8f-4d29-aae6-9a5b1f232aac)
</br> Click buy để mua hàng và lưu dữ liệu của order vào database: ![image](https://github.com/Genzi135/HuynhTrieuPhu-20076921-Java-WWW/assets/104980263/182818ca-dba3-4657-aa99-2d7cc4806b54)



