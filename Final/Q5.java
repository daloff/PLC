for (i = 1; i <= n; i++) {
      int count = 0;
      for (j = 1; j <= n; j++){
        if (x[i][j] == 0){
          count++;
        }
        if(count == n){
          System.out.println("First all-zero row is: " + i);
          break;
        }
      }
    }
