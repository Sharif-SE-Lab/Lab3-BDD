# شرح آزمایش
در این آزمایش می‌خواهیم **روش ایجاد رفتارمحور** را، با به کار بردن آن در یک پروژه‌ی عملی، بیاموزیم. ایجاد رفتارمحور یکی از مشتقات روش ایجاد مبتنی بر آزمونِ نرم‌افزار می‌باشد.\
در روش مبتنی بر آزمون - که در [آزمایش قبل](https://github.com/Sharif-SE-Lab/Lab2-SOLID) به آن پرداخته شد - دریافتیم در این روش ایجاد پیش از شروع فرایند ایجاد نرم‌افزار موارد و سناریوهای تست واحد آن استخراج و با صرف نظر از نحوه طراحی و پیاده‌سازی سیستم جدید برنامه نویسی می‌شوند.
سپس فرایند ایجاد آغاز می‌شود. برنامه ایجاد شده چندین و چند بار بازآرایی شده تا در نهایت تمامی تست‌های از پیش نوشته شده را با موفقیت بگذراند.\
از آنجایی که **روش ایجاد رفتارمحور** از روش ایجاد آزمون محور مشتق می‌شود، می‌توان حدس زد که در این روش نیز تست‌نویسی پیش از ایجاد خود سیستم آغاز می‌گردد. 
تفاوت این روش (BDD) با روش پیشین (TDD) آن است که تمرکز این روش به جای آنکه روی تست واحدهای ریزدانه‌ی مجزایی باشد که تنها در سطح طراحی و پیاده سازی تمرکز دارد، تمرکز آن روی رفتار درشت دانه سیستم است که از سمت کاربر نیز قابل مشاهده می‌باشد.
- در گام اول از این روش ایجاد، مجموعه رفتارهای مورد انتظار سیستم مستند سازی می‌شود.
- در گام دوم به ازای هر رفتار، یک مجموعه سناریو به منظور درخواست سرویس و مشاهده رفتار سیستم به زبان Gherkin - که بسیار نزدیک به زبان انسان و قابل فهم برای کاربر است - مکتوب می‌شود.
- در گام سوم مکتوبات Gherkin با ابزاری به نام Cucumber به یک مجموعه آزمون قابل اجرا در زبان برنامه نویسی پایگاه کد مبدل می‌شود.
- گام چهارم و آخر، ایجاد سیستم و بازآرایی کد تا آنجا که مجموعه آزمون‌ها پاس شوند خواهد بود.
## بخش اول: ایجاد ماشین حساب با عملیات جمع

### مرحله ۱
<img class="portrait" alt="task 1.1.3" src="pictures/1.previous_task/1.3.png">

### مرحله ۲
<img class="portrait" alt="task 1.2.1" src="pictures/1.previous_task/2.1.png">

### مرحله ۳
<img class="landscape" alt="task 1.3.1" src="pictures/1.previous_task/3.1.png">
<img class="landscape" alt="task 1.3.2" src="pictures/1.previous_task/3.2.png">

### مرحله ۵
<img class="size-0" alt="task 1.5.1" src="pictures/1.previous_task/5.1.png">

### مرحله ۶
<img class="landscape" alt="task 1.6.1" src="pictures/1.previous_task/6.1.png">
<img class="size-0" alt="task 1.6.2" src="pictures/1.previous_task/6.2.png">

### مرحله ۷
<img class="size-0" alt="task 1.7.1" src="pictures/1.previous_task/7.1.png">

### مرحله ۸
<img class="landscape" alt="task 1.8.1" src="pictures/1.previous_task/8.1.png">
<img class="landscape" alt="task 1.8.2" src="pictures/1.previous_task/8.2.png">
<img class="portrait" alt="task 1.8.3" src="pictures/1.previous_task/8.3.png">
<img class="landscape" alt="task 1.8.4" src="pictures/1.previous_task/8.4.png">
<img class="portrait" alt="task 1.8.5" src="pictures/1.previous_task/8.5.png">
<img class="portrait" alt="task 1.8.6" src="pictures/1.previous_task/8.6.png">

### مرحله ۹
<img class="portrait" alt="task 1.9.1" src="pictures/1.previous_task/9.1.png">

### مرحله ۱۰
<img class="portrait" alt="task 1.10.1" src="pictures/1.previous_task/10.1.png">

### مرحله ۱۱
<img class="portrait" alt="task 1.11.1" src="pictures/1.previous_task/11.1.png">

### مرحله ۱۲
<img class="portrait" alt="task 1.12.1" src="pictures/1.previous_task/12.1.png">

### مرحله ۱۳
<img class="portrait" alt="task 1.13.1" src="pictures/1.previous_task/13.1.png">

* این عکس پس از درست کردن قسمت result سناریوی قبل و هنگام اجرای مجدد تست گرفته شده است، و ربطی به سناریوی جدید ندارد.
<img class="portrait" alt="task 1.13.2" src="pictures/1.previous_task/13.2.png">

<img class="portrait" alt="task 1.13.3" src="pictures/1.previous_task/13.3.png">
# بخش دوم: ایجاد ماشین حساب اصلی