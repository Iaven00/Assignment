package com.yufop.tran.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yufop.tran.pojo.table.Bill;
import com.yufop.tran.pojo.table.Order;
import com.yufop.tran.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {


    @Autowired
    OrderService orderService;

    /**
     * 列出用户的所有订单
     * @param pageNum
     * @param pageSize
     * @param userid
     * @return
     */
    @GetMapping("/list_order")
    @ResponseBody
    public PageInfo<Order> get_allrecords(@RequestParam("pageNum")Integer pageNum, @RequestParam("pageSize")Integer pageSize, int userid){
        PageHelper.startPage(pageNum,pageSize);

        /**TODO
         *
         */
        PageInfo<Order> pageInfo = new PageInfo<Order>();
        return pageInfo;
    }




    /**
     * 根据收件人姓名查询订单
     * @param pageNum
     * @param pageSize
     * @param name
     * @return
     */
    @GetMapping("/search_orderbyname")
    @ResponseBody
    public PageInfo<Order> get_recordsbyname(@RequestParam("pageNum")Integer pageNum, @RequestParam("pageSize")Integer pageSize,int userid,String name){
        PageHelper.startPage(pageNum,pageSize);

        /**TODO
         *
         */
        PageInfo<Order> pageInfo = new PageInfo<Order>();
        return pageInfo;
    }


    /**
     * 根据收获地址查询
     * @param pageNum
     * @param pageSize
     * @param userid
     * @param address
     * @return
     */
    @GetMapping("/search_orderbyaddress")
    @ResponseBody
    public PageInfo<Order> get_recordsbyaddress(@RequestParam("pageNum")Integer pageNum, @RequestParam("pageSize")Integer pageSize,int userid,String address){
        PageHelper.startPage(pageNum,pageSize);

        /**TODO
         *
         */
        PageInfo<Order> pageInfo = new PageInfo<Order>();
        return pageInfo;
    }


    /**
     * 计算并列出不同的物流公司对该订单的预计送达时间和花费
     * @param pageNum
     * @param pageSize
     * @param order
     * @return
     */
    @GetMapping("/list_orderdetails")
    @ResponseBody
    public PageInfo<Object> get_allrecords(@RequestParam("pageNum")Integer pageNum, @RequestParam("pageSize")Integer pageSize, Order order){
        PageHelper.startPage(pageNum,pageSize);

        /**TODO
         *
         */
        PageInfo<Object> pageInfo = new PageInfo<>();
        return pageInfo;
    }

    /**
     * 选择物流公司提交订单
     * @param order
     * @return
     */
    @PostMapping("/submit_order")
    @ResponseBody
    public int order(Order order,int transunit){

        /**TODO
         *
         */
        return 1;
    }


    /**
     * 撤销订单（退款）
     * @param orderid
     * @return
     */
    @PostMapping("/revoke_order")
    @ResponseBody
    public int revoke(Integer orderid){

        System.out.println(orderid);
        /**TODO
         *
         */
        return 1;
    }

    /**
     * 查看用户账单
     * @param userid
     * @return
     */
    @GetMapping("/search_bill")
    @ResponseBody
    public PageInfo<Bill> search_bill(@RequestParam("pageNum")Integer pageNum, @RequestParam("pageSize")Integer pageSize, int userid){

        PageHelper.startPage(pageNum,pageSize);

        /**TODO
         *
         */
        PageInfo<Bill> pageInfo = new PageInfo<>();
        return pageInfo;
    }


    /**
     * 删除账单
     * @param userid
     * @param billid
     * @return
     */
    @PostMapping("/delete_bill")
    @ResponseBody
    public int delete_bill(int userid,int billid){

        /**TODO
         *
         */
        return 1;
    }

    @GetMapping("/selectBysp")
    @ResponseBody
    public List<Order> Listordersp(String phone){
        return orderService.list_sporders(phone);
    }

    @GetMapping("/selectByrp")
    @ResponseBody
    public List<Order> Listorderrp(String phone){
        return orderService.list_rporders(phone);
    }


    @GetMapping("/selectAll")
    @ResponseBody
    public List<Order> Listorder(){
        return orderService.list_orders();
    }

    @PostMapping("/addOrder")
    @ResponseBody
    public int addOrder(Order order){
        return orderService.add_Order(order);
    }




}
