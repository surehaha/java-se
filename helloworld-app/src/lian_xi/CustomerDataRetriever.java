package lian_xi;

import java.util.List;

class CustomerDataRetriever {
        private DataBase dbConnectionManager;

        public CustomerDataRetriever(DataBase dbConnectionManager) {
                this.dbConnectionManager = dbConnectionManager;
        }

        public List findCustomers() {
                System.out.println("查找顾客数据...");
                return null;
        }
}
